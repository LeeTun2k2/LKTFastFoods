var alerts={
	'success':document.getElementById("success-alert")
}

function showAlert(type, message="") {
	if (type)
    	alerts[type].fadeTo(2000, 500).slideUp(500, function() {
      		alerts[type].slideUp(500);
	});
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
	alert("assessment-submit")
}

// accounts
// button rollback
const accountRollback = document.getElementById("account-rollback")
assessmentSubmit.onclick=()=>{
	alert("account-rollback")
}

// button submit
const accountSubmit = document.getElementById("account-submit")
assessmentSubmit.onclick=()=>{
	showAlert("success")
}

