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

// header
var pages = {}
const quickAccess = document.querySelectorAll(".quick-access ul li")
var currPageName = "account"
function movePage(item) {
	let name = item.classList[0]
	pages[name] = document.getElementById(name)
	item.onclick = function() {
		pages[currPageName].classList.add("hide")
		currPageName = name
		pages[name].classList.remove("hide")
	}
}
quickAccess.forEach(movePage)


function openInNewTab(url) {
  window.open(url, '_blank').focus();
}

const logout = document.querySelector(".logout")
logout.onclick = () => {
	location.href = "../Logout"
}

