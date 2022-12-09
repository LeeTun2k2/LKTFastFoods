const notifies = {
	"success": document.querySelector(".notify.success"),
	"warning": document.querySelector(".notify.warning"),
	"error": document.querySelector(".notify.error")
}

function showNotify(type, message){
	if (type in notifies)
	{
		notifies[type].childNodes[3].innerText = message
		notifies[type].classList.remove("hide")
		setTimeout(()=>{
			notifies[type].classList.add("hide")
		}, 5000)
	}
}


// navigation bar
const headerMenu = document.getElementById("header-menu")
headerMenu.onclick = () => {
	 window.location = "Menu";
}

const headerHistory = document.getElementById("header-history")
headerHistory.onclick = () => {
	 window.location = "Order-History";
}

const headerAssessment = document.getElementById("header-assessment")
headerAssessment.onclick = () => {
	 window.location = "Assessment";
}

const headerCart = document.getElementById("header-cart")
headerCart.onclick = () => {
	 window.location = "Cart";
}

const headerAccount = document.getElementById("header-account")
headerAccount.onclick = () => {
	 window.location = "Account";
}


