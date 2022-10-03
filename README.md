A bank deals with client accounts. An account contains details of various clients’ financial products. These products could be:
•    stocks, 
•    bonds and 
•    derived products. 
A derived product is a combined financial product it’s like a “basket” which contains other financial products: stocks, bonds or even other derived products. For example Derived Product “Ruby” contains 10 IBM shares and 4 Hungarian Government Bonds. That also means if you own 2 of this product basically you have 20 IBM shares and 8 Hungarian Government Bonds. 
All these products have the same properties (like id, name, description, etc.) but derivatives and bonds have an extra property: expiry date. 

```
My Account
Product name        Quantity
IBM                  500
Gov. Bond HUN        3
Derived “Ruby”       2
---IBM               ---10
---Gov. Bond HUN     ---4
```

0. How many IBM stocks do we have in an above example? (520)

1. How would you design the scenario above? Please create the in-memory class model/hierarchy of it.

2. What kind of structure would you use on account to store products? And on derived products? How would you store quantity of products?

3. Algo question

* `p`: the product we are interested in
* `assets`: the assets on a client's account
```Java
    int ibmStockQuantity = getQty(p, assets) {
    }
```

