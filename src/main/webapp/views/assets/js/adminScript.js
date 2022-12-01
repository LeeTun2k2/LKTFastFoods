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

//account
const accountSearch = document.getElementById("account-search")
accountSearch.onclick = () => {
	showNotify("success", "test thanh cong")
}

const accountLock = document.getElementById("account-lock")
accountLock.onclick = () => {
	showNotify("success", "test thanh cong")
}

const accountUnlock = document.getElementById("account-unlock")
accountUnlock.onclick = () => {
	showNotify("success", "test thanh cong")
}

//order
const orderSearch = document.getElementById("order-search")
orderSearch.onclick = () => {
	showNotify("success", "test thanh cong")
}


//menu
const menuSearch = document.getElementById("menu-search")
menuSearch.onclick = () => {
	showNotify("success", "test thanh cong")
}

const menuAdd = document.getElementById("menu-add")
menuAdd.onclick = () => {
	openInNewTab("/LKTFastFood/views/admin/MenuAction.jsp")
}

const menuEdit = document.getElementById("menu-edit")
menuEdit.onclick = () => {
	openInNewTab("/LKTFastFood/views/admin/MenuAction.jsp")
}

const menuDelete = document.getElementById("menu-delete")
menuDelete.onclick = () => {
	showNotify("success", "test thanh cong")
}

//voucher
const voucherSearch = document.getElementById("voucher-search")
voucherSearch.onclick = () => {
	openInNewTab("/LKTFastFood/views/admin/VoucherAction.jsp")
}

const voucherAdd = document.getElementById("voucher-add")
voucherAdd.onclick = () => {
	openInNewTab("/LKTFastFood/views/admin/VoucherAction.jsp")
}

const voucherEdit = document.getElementById("voucher-edit")
voucherEdit.onclick = () => {
	showNotify("success", "test thanh cong")
}

const voucherDelete = document.getElementById("voucher-delete")
voucherDelete.onclick = () => {
	showNotify("success", "test thanh cong")
}
