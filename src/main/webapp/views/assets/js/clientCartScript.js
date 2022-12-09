let cartJSON = localStorage.getItem("cart");
let cart = JSON.parse(cartJSON);

const cartTable = document.querySelector("#cart table tbody")
function render() {
	let htmlCode = ""
	Object.keys(cart).forEach((id)=>{
		htmlCode += `
			<tr id="${id}">
				<th scope="row" class="text-center">${cart[id].stt} </th>
				<td>${cart[id].name}</td>
				<td>
					<ul>
						<li class="action decrease"><i class="fas fa-minus"></i></li>
						<li><span class="quantity">${cart[id].quantity}</span></li>
						<li class="action increase"><i class="fa fa-plus"></i></li>
					</ul>
				</td>
				<td class="text-center">${cart[id].price}đ</td>
			</tr>`
	})
	cartTable.innerHTML = htmlCode
}
render()

function amount()
{
	let cartAmount = document.querySelector("#cart .amount")
	let amount = 0
	Object.keys(cart).forEach((id)=>amount+=cart[id].quantity * cart[id].price)
	cartAmount.textContent = amount + "đ"
}
amount()

let rows = document.querySelectorAll("#cart table tbody tr")
rows.forEach((row)=>{
	let id = row.id
	var sub = row.querySelector(".decrease")
	var add = row.querySelector(".increase")
	var quantity = row.querySelector(".quantity")
	add.onclick = () => {
		quantity.textContent = ++cart[id].quantity
		amount()
	}
	sub.onclick = () => {
		if (cart[id].quantity > 0){
			quantity.textContent = --cart[id].quantity
			amount()			
		}
			
	}
})


const submit = document.getElementById("payment-submit")
submit.onclick = () => {
	let myJSON = JSON.stringify(cart);
	localStorage.setItem("cart", myJSON);
	window.location = "Payment";
}
const cancel = document.getElementById("payment-cancel")
cancel.onclick = () => {
	cart = {}
	amount()
	render()
}
