# Fawry Quantum Internship Challenge – E-commerce System 🛒

This project is a backend simulation of an **E-commerce System**, developed as part of the **Fawry Rise Journey – Full Stack Development Internship Challenge**.

It demonstrates solid object-oriented principles using Java, simulating real-world features like products (including perishable and shippable ones), cart operations, checkout processing, and shipping logic.

---

## ✅ Features

- **Product Management**
  - Supports perishable (e.g. Cheese, Biscuits) and non-perishable products (e.g. TV).
  - Allows defining products with name, price, quantity, and optional weight.

- **Shippable Products**
  - Products that implement the `Shippable` interface provide their name and weight.
  - Shipping logic handles packaging and fee calculation.

- **Cart Operations**
  - Add products to cart without exceeding available quantity.
  - Prevents adding expired or unavailable products.

- **Checkout Process**
  - Calculates subtotal, shipping fees, total amount, and updates customer balance.
  - Rejects checkout for:
    - Empty cart
    - Insufficient balance
    - Expired or unavailable items

- **Console Output**
  - Clearly displays shipment details and checkout receipt, matching the format specified in the challenge.
---
## 🛠️ Technologies Used

- Java 17
- Maven
- NetBeans 20

---

## 🚀 How to Run

1. Open the project in **NetBeans IDE**
2. Run the `Main.java` file located in `com.fawryy` package
3. Console will display shipment and checkout summary

---

## Contact
Need help or have a question? Feel free to reach out!
📧 Email: [yousraamr000@gmail.com](mailto:yousraamr000@gmail.com)  
🔗 LinkedIn: [www.linkedin.com/in/yousra-amr-93a691279](https://www.linkedin.com/in/yousra-amr-93a691279)  
🐙 GitHub: [@yousraamr](https://github.com/yousraamr)


