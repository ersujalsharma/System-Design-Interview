```markdown
# 🚗 Parking Lot Management System - LLD (Low-Level Design)

A low-level design implementation of a real-world **Parking Lot Management System** using Java and Object-Oriented Programming principles. This project simulates a system that handles vehicle entry/exit, ticketing, and parking fee calculation for two-wheeler and four-wheeler vehicles.

---

## 📌 Features

- ✅ Entry and Exit Gates
- ✅ Parking spot allocation for Two-Wheelers & Four-Wheelers
- ✅ Ticket generation on vehicle entry
- ✅ Dynamic rent calculation based on parking duration
- ✅ Extensible parking spot system
- ✅ Clean, modular and testable code structure

---

## 📦 Project Structure

```

MachineCodingRound/
└── Design\_Parking\_Lot/
├── Gates/
│   ├── EntryGate.java
│   └── ExitGate.java
├── ParkingLot/
│   └── ParkingLot.java
├── ParkingSpots/
│   ├── ParkingSpot.java
│   ├── TwoWheelerParkingSpot.java
│   └── FourWheelerParkingSpot.java
├── Vehicle/
│   ├── Vehicle.java
│   └── VehicleType.java
├── Ticket.java
└── Main.java

````

---

## 🧠 Design Principles Used

- **OOP Concepts** – Encapsulation, Abstraction, Inheritance, and Polymorphism
- **SOLID Principles**
- **Strategy Pattern** (for flexible rent calculation)
- **Separation of Concerns** – clear segregation of gates, vehicles, and spots

---

## ⚙️ Technologies Used

- Language: **Java**
- Design: **Low-Level Design (LLD)** using OOP
- Build Tool: *None* (simple Java project)
- IDE: **VSCode / IntelliJ IDEA**

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone [https://github.com/ersujalsharma/parking-lot-LLD.git](https://github.com/ersujalsharma/System-Design-Interview/tree/0560a4f67cd73fca98554ddd7b88ddcef42f5c31/Low_Level_Design/MachineCodingRound/Design_Parking_Lot)
   cd parking-lot-LLD
````

2. Compile and Run the main class:

   ```bash
   javac Main.java
   java Main
   ```

---

## 📷 Sample Output

```java
true
UP78AB1234 the rent is - 2.0
```

---

## 📈 Future Enhancements

* [ ] Support for multiple floors
* [ ] Admin dashboard to monitor parking spot availability
* [ ] Payment integration module
* [ ] Concurrency support for real-time bookings
* [ ] REST API using Spring Boot

---

## 🙌 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

---

## ✍️ Author

**Sujal Sharma**
Feel free to connect with me on [LinkedIn](https://www.linkedin.com/in/sujalsharma)

---

```

Let me know if you'd like:
- A system **UML or flow diagram** added in markdown,
- A badge section (like Java version, build status),
- Or a more advanced README with code coverage/test instructions.

Also, don’t forget to update:
- `github.com/your-username/parking-lot-LLD` with your actual repo URL.
- Add a `LICENSE` file if you’re planning to open-source it.
```
