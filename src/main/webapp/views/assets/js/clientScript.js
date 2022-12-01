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
const quickAccess = document.querySelectorAll(".quick-access div div")
var curr = quickAccess[0]
var currPageName = "menu"
function setBorder(item) {
	let name = item.classList[0]
	pages[name] = document.getElementById(name)
	item.onclick = function() {
		curr.classList.remove("border")
		curr = item
		curr.classList.add("border")
		pages[currPageName].classList.add("hide")
		currPageName = name
		pages[name].classList.remove("hide")
	}
}
quickAccess.forEach(setBorder)

// menu
const menuAddProducts = document.querySelectorAll("#menu  .single-product .part-1 ul li")
menuAddProducts.forEach((item)=>{
	item.onclick=()=>{
		
	}
})


// assessment
const ratingStars = document.querySelectorAll("#assessment .star span")
function rating(star) {
	star.onclick = () => {
		let id = parseInt(star.id[5])
		for (let i = 0; i < 5; i++)
			ratingStars[i].classList.remove("checked")
		for (let i = 0; i < id; i++)
			ratingStars[i].classList.add("checked")
	}
}
ratingStars.forEach(rating)


// button assessment-submit
const assessmentSubmit = document.getElementById("assessment-submit")
assessmentSubmit.onclick=()=>{
	showNotify("success", "Đánh giá thành công.")
}

// accounts
// button rollback
const accountRollback = document.getElementById("account-rollback")
accountRollback.onclick=()=>{
	showNotify("warning", "Không có thông tin nào thay đỏi.")
}

// button submit
const accountSubmit = document.getElementById("account-submit")
accountSubmit.onclick=()=>{
	showNotify("success", "Cập nhật thông tin thành công.")
}







