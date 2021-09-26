function judgeNull () {
	if (myform.ID.value=="")
	{
		alert("请填写姓名");
		return false;

	}
	if (myform.name.value=="")
	{
		alert("请填写姓名");
		return false;

	}
	if (myform.sex.value=="")
	{
		alert("请勾选性别");
		return false;
	}
	if (myform.address.value=="")
	{
		alert("请填写地址");
		return false;
	}
}
function estimateNull(){
		if (myform.name.value=="")
		        {
		            alert("请填写姓名");
					return false;

		        }
				if (myform.sex.value=="")
				        {
				            alert("请勾选性别");
							return false;
				        }
		if (myform.address.value=="")
		        {
		            alert("请填写地址");
					return false;
		        }            
	}