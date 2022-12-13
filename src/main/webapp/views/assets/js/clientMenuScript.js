const buttonAddProducts = document.querySelectorAll(".single-product ul li") 
let cartJSON = localStorage.getItem("cart");
let cart = JSON.parse(cartJSON);
if (!(cart)) {
	cart = {}
}


buttonAddProducts.forEach((button)=>{
	button.onclick = () => {
		let product = document.getElementById("product-"+button.id)
		if (!(button.id in cart))
		{
			let stt = Object.keys(cart).length + 1
			let name = product.getElementsByClassName("product-title")[0].textContent
			let quantity = 1
			let price = product.getElementsByClassName("product-price")[0].textContent.slice(0, -1)
			cart[button.id] = {stt, name, quantity, price}
		}
		else
		{
			cart[button.id].quantity ++
		}
		let myJSON = JSON.stringify(cart);
		localStorage.setItem("cart", myJSON);
	}
})
