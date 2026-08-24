# ClinicCare
A Java-based Clinic Management System for registering patients, managing appointments, assigning doctors, and handling consultation billing and payment status.

🏥 Clinic Appointment System

A console-based Clinic Appointment System developed using Java. The system helps manage patient information, appointments, doctors, consultation types, and basic billing.

✨ Features

* 👤 Register new patients
* 🆔 Automatically generate Patient IDs
* 🔎 View patient details
* 👨‍⚕️ Assign doctors to appointments
* 📅 Book appointments
* 🕐 Set appointment dates and times
* 📋 View appointment details
* ❌ Cancel appointments
* 💰 Select consultation types and fees
* 💳 Track payment status
* 🧾 View patient bills

💰 Consultation Types

Consultation Type	Fee
General Consultation	R350
Follow-up Consultation	R250
Emergency Consultation	R500

🛠️ Technologies Used

* Java
* Java Scanner
* Arrays
* Methods
* Loops
* Conditional Statements
* Switch Statements

📋 System Menu

1. Register Patient
2. View Patient
3. Book Appointment
4. View Appointments
5. Cancel Appointment
6. View Bill
7. Exit

⚙️ How It Works

Patients can be registered by entering their personal information. The system automatically generates a unique Patient ID.

Once registered, the patient can have an appointment booked with a doctor. During the booking process, the user selects the consultation type, and the system automatically assigns the relevant consultation fee.

The system also records whether the consultation has been Paid or is Pending.

💻 Example

----- BOOK APPOINTMENT -----
Enter Patient ID: p004
Patient: Vanessa Che
Enter doctor name: Johnson Henry
Enter appointment date: 30 August 2026
Enter appointment time: 10:00
----- CONSULTATION TYPE -----
1. General Consultation - R350
2. Follow-up Consultation - R250
3. Emergency Consultation - R500
Choose consultation type: 1
Payment status (Paid/Pending): Pending
Appointment booked successfully!
Doctor: Johnson Henry
Date: 30 August 2026
Time: 10:00
Consultation: General Consultation
Fee: R350.00
Payment: Pending
