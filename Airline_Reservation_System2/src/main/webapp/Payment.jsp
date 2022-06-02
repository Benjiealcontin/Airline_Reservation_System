<!DOCTYPE html>
<html>
    <head>
        <title>The Generics | Store</title>
        <meta name="description" content="This is the description">
        <link rel="stylesheet" href="css/payment.css" />
        <script src="javascript/payment.js" async></script>
    </head>
    <body>
        <section class="container content-section">
            <h2 class="section-header">Final Transaction</h2>
            <div class="shop-items">
                <div class="shop-item">
                    <span class="shop-item-title">Boracay</span>
                    <img class="shop-item-image" src="images/boracay.jpeg">
                    <div class="shop-item-details">
                        <span class="shop-item-price">$500,000</span>
                        <button class="btn btn-primary shop-item-button" type="button">ADD TO CART</button>
                    </div>
                </div>
                <div class="shop-item">
                    <span class="shop-item-title">Bohol</span>
                    <img class="shop-item-image" src="images/Bohol2.jpg">
                    <div class="shop-item-details">
                        <span class="shop-item-price">$110,000</span>
                        <button class="btn btn-primary shop-item-button" type="button">ADD TO CART</button>
                    </div>
                </div>
                                <div class="shop-item">
                    <span class="shop-item-title">Siargao</span>
                    <img class="shop-item-image" src="images/sairgao.jpeg">
                    <div class="shop-item-details">
                        <span class="shop-item-price">$50,000</span>
                        <button class="btn btn-primary shop-item-button" type="button">ADD TO CART</button>
                    </div>
                </div>
            </div>
        </section>
        <section class="container content-section">
            <h2 class="section-header">CART</h2>
            <div class="cart-row">
                <span class="cart-item cart-header cart-column">ITEM</span>
                <span class="cart-price cart-header cart-column">PRICE</span>
               <!--  <span class="cart-quantity cart-header cart-column">QUANTITY</span> -->
            </div>
            <div class="cart-items">
            </div>
            <div class="cart-total">
                <strong class="cart-total-title">Total</strong>
<!--                 <span class="cart-total-price">$0</span> -->
            </div>
            <button class="btn btn-primary btn-purchase" type="button">PURCHASE</button>
        </section>
    </body>
</html>