$(function(){
	
	switch(menu){
	
	case 'AboutUs':
		$('#about').addClass('active')
		break;
	case 'contactus':
		$('#contact').addClass('active')
		break;
	default:
		$('#home').addClass('active')
		break;
	}
})