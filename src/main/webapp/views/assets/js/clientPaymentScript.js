let cartJSON = localStorage.getItem("cart");
let cart = JSON.parse(cartJSON);

const cartTable = document.querySelector("#payment table tbody")
const data = document.getElementsByName("data")[0]
function render() {
	let htmlCode = ""
	Object.keys(cart).forEach((id)=>{
		htmlCode += `
			<tr id="${id}">
				<th scope="row" class="text-center">${cart[id].stt}</th>
				<td>${cart[id].name}</td>
				<td class="text-center">
					<span class="quantity">${cart[id].quantity}</span>
				</td>
				<td class="text-center">${cart[id].price}đ</td>
			</tr>`
	})
	cartTable.innerHTML = htmlCode
	data.value=cartJSON
}
render()

function amount()
{
	let cartAmount = document.querySelector("#payment .amount")
	let amount = 0
	Object.keys(cart).forEach((id)=>amount+=cart[id].quantity * cart[id].price)
	cartAmount.value = amount
}
amount()

const submit = document.getElementById("payment-submit")
submit.onclick = () => {
	localStorage.clear();
}