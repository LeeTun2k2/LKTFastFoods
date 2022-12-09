// assessment
const assessmentTableRows = document.querySelectorAll("#assessment tbody tr")
const assessmentOrderID = document.querySelector("#assessment .orderID")
const assessmentOrderIDValue = document.querySelector("#assessment input.orderID")

assessmentTableRows.forEach((row)=>{
	row.onclick = ()=> {
		assessmentOrderID.textContent = row.childNodes[1].textContent
		assessmentOrderIDValue.value = assessmentOrderID.textContent
	}
})

const ratingStars = document.querySelectorAll("#assessment .star span")
const starvalue = document.querySelector("#assessment .starvalue")
function rating(star) {
	star.onclick = () => {
		let id = parseInt(star.id[5])
		for (let i = 0; i < 5; i++)
			ratingStars[i].classList.remove("checked")
		for (let i = 0; i < id; i++)
			ratingStars[i].classList.add("checked")
		starvalue.value = star.id.slice(5)
	}
}
ratingStars.forEach(rating)


