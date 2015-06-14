function drawVisualization() {
  
	var data = new google.visualization.DataTable();
	data.addColumn('string', 'Day');
	data.addColumn('number', 'Ideal');
	data.addColumn('number', 'Progress');
	data.addColumn('number', 'Done');
	data.addColumn('number', 'Estimated Done');
	data.addColumn('number','Done Projection');
	data.addColumn({type:'boolean',role:'certainty'});
 
	var totalEstimated = $("#estimated").val();
	
	var daysOfSprint = 10;
	var today = $("#currentSprintDay").val(); 
	
	var idealCol = parseInt(totalEstimated);
	var estimatedWorkDone = parseFloat(idealCol/daysOfSprint);
	var projectionFlag = true;
	
	var debugStr = "";
	
	var rows = $('tr[id^="row_"]');
	var remainingArray = new Array(daysOfSprint + 1);
	var workDoneArray = new Array(daysOfSprint + 1);
	var a = 1;
	rows.each(function(){
		var remaining = $(this).find(".remaining");
		var workDone = $(this).find(".workDone");
		
		workDoneArray[a] = parseFloat(workDone.text());
		remainingArray[a] = parseFloat(remaining.text());
		a++;
	});
	
	var projectionRemaining = null;
	
	for(var i = 1;i<=daysOfSprint + 1;i++){
		
		if(i <= today){
			if(i == today){
				projectionRemaining = remainingArray[i];
			}
			
			data.addRow([i.toString(),idealCol,remainingArray[i],workDoneArray[i],estimatedWorkDone,projectionRemaining,projectionFlag]);
			debugStr += '[' + i.toString() + ',' + idealCol + ',' + remainingArray[i] + ',' + workDoneArray[i] + ',' + estimatedWorkDone + ',' + projectionRemaining + ',' + projectionFlag + ']\n';
			
			if(i == today){projectionFlag = false;}
		} else {			
			
			if(projectionRemaining > 0){
				projectionRemaining = projectionRemaining - estimatedWorkDone;						
				projectionRemaining = (projectionRemaining < 0.1 ? 0 : projectionRemaining);
			} else {
				projectionRemaining = null;
			}
			data.addRow([i.toString(),idealCol,null,null,estimatedWorkDone,projectionRemaining,projectionFlag]);
			debugStr += '[' + i.toString() + ',' + idealCol + ',' + null + ',' + null + ',' + estimatedWorkDone + ',' + projectionRemaining + ',' + projectionFlag + ']\n';
		}
		
		if(idealCol > 0){
			idealCol = idealCol - estimatedWorkDone;
			idealCol = (idealCol < 0.1 ? 0 : idealCol);
		} else {
			idealCol = null;
		}
	}
	
	//alert(debugStr);
	
  /*data.addRows([
    //['0', 100, null, null, null, 100, true],
    ['1', 100, 100, 5, iterationVal, null, true],
    ['2', 90, 95, 5, iterationVal, null, true],
    ['3', 80, 90, 10, iterationVal, null, true],
    ['4', 70, 80, null, iterationVal, 80, true],
    ['5', 60, null, null, iterationVal, 70, false],
    ['6', 50, null, null, iterationVal, 60, false],
    ['7', 40, null, null, iterationVal, 50, false],
    ['8', 30, null, null, iterationVal, 40, false],
    ['9', 20, null, null, iterationVal, 30, false],
    ['10', 10, null, null, iterationVal, 20, false],
    ['11', 0, null, null, iterationVal, 10, false],
    ['12', null, null, null, null, 0, false]
  ]);*/ 

  // Create and draw the visualization.
  var ac = new google.visualization.ComboChart(document.getElementById('visualization'));
  
  var width = $("#width").val();
  var height = $("#height").val();
  
  ac.draw(data, {
    width: width,
    height: height,
    vAxis: {title: "Hours"},
    hAxis: {title: "Days"},
    seriesType: "line",
    curveType: "function",
    series: {2: {type: "bars"},3: {type: "bars"}}
  });

}