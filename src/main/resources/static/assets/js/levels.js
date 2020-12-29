

/*$(function(){
	
	getlfls();
	
	
})


function getlfls(){
	
	
	
	$.ajax({
		type:"post",
		url:"api/gmall/fl/getall",
		datatype:"json",
		success:function(fls){
			
			
			$.each(fls,function(i,fl){
				
				var li='<li class="dropdown menu-item"> '+
						'<a href="#" class="dropdown-toggle" data-toggle="dropdown">'+
						'<i aria-hidden="true" class='+'"'+fl.ficon+'"'+'></i>'+
						'<font style="vertical-align: inherit;">'+
						'<font style="vertical-align: inherit;">'+fl.fname+'</font>'+
						'</font>'+
						'</a> </li>';
          		$("#flist").append($(li));
                
				
			})
		}
		
	});
}*/

