package clinic.system;

import java.util.Scanner;

public class ClinicSystem {

    static Scanner s = new Scanner(System.in);

    static int accountCounter = 0;

    static String[] patientName = new String[100];
    static String[] patientAge = new String[100];
    static String[] patientPhone = new String[100];
    static String[] patientID = new String[100];
    static String[] customerEmail = new String[100];

    static String[] doctorName = new String[100];
    static String[] appointmentDate = new String[100];
    static String[] appointmentTime = new String[100];

    // New billing information
    static String[] consultationType = new String[100];
    static double[] consultationPrice = new double[100];
    static String[] paymentStatus = new String[100];

    static int option;
    static String ID;

    static void loadPatients() {

        patientName[0] = "Maya Williams";
        patientAge[0] = "23";
        patientPhone[0] = "0734657384";
        patientID[0] = "p001";
        customerEmail[0] = "maya@gmail.com";

        doctorName[0] = "Johnson Henry";
        appointmentDate[0] = "25 August 2026";
        appointmentTime[0] = "10:00";
        consultationType[0] = "General Consultation";
        consultationPrice[0] = 350.00;
        paymentStatus[0] = "Paid";

        patientName[1] = "Ethan Scotts";
        patientAge[1] = "48";
        patientPhone[1] = "0637485937";
        patientID[1] = "p002";
        customerEmail[1] = "ethan@gmail.com";

        doctorName[1] = "Taylor Casey";
        appointmentDate[1] = "26 August 2026";
        appointmentTime[1] = "11:30";
        consultationType[1] = "Follow-up Consultation";
        consultationPrice[1] = 250.00;
        paymentStatus[1] = "Pending";

        patientName[2] = "Zara Kim";
        patientAge[2] = "12";
        patientPhone[2] = "0734374839";
        patientID[2] = "p003";
        customerEmail[2] = "kim@gmail.com";

        doctorName[2] = "Zedd Ted";
        appointmentDate[2] = "27 August 2026";
        appointmentTime[2] = "09:00";
        consultationType[2] = "General Consultation";
        consultationPrice[2] = 350.00;
        paymentStatus[2] = "Paid";

        accountCounter = 3;
    }

    static void patientMenu() {

        boolean again = true;

        while (again) {

            System.out.println("\n==============================");
            System.out.println("       CLINIC SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patient");
            System.out.println("3. Book Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Cancel Appointment");
            System.out.println("6. View Bill");
            System.out.println("7. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            option = s.nextInt();
            s.nextLine();

            switch (option) {

                // REGISTER PATIENT
                case 1:

                    System.out.println("\n----- REGISTER PATIENT -----");

                    System.out.print("Enter patient name: ");
                    String name = s.nextLine();

                    System.out.print("Enter patient age: ");
                    String age = s.nextLine();

                    System.out.print("Enter patient number: ");
                    String phone = s.nextLine();

                    System.out.print("Enter email: ");
                    String email = s.nextLine();

                    String newID = String.format("p%03d",
                            accountCounter + 1);

                    patientName[accountCounter] = name;
                    patientAge[accountCounter] = age;
                    patientPhone[accountCounter] = phone;
                    patientID[accountCounter] = newID;
                    customerEmail[accountCounter] = email;

                    accountCounter++;

                    System.out.println("\nPatient registered successfully!");
                    System.out.println("Patient ID: " + newID);
                    System.out.println("Name: " + name);

                    break;

                // VIEW PATIENT
                case 2:

                    System.out.println("\n----- PATIENT DETAILS -----");

                    System.out.print("Enter Patient ID: ");
                    ID = s.nextLine();

                    boolean foundPatient = false;

                    for (int i = 0; i < accountCounter; i++) {

                        if (patientID[i] != null &&
                                patientID[i].equals(ID)) {

                            foundPatient = true;

                            System.out.println("Name: " + patientName[i]);
                            System.out.println("Age: " + patientAge[i]);
                            System.out.println("Phone: " + patientPhone[i]);
                            System.out.println("Email: " + customerEmail[i]);
                            System.out.println("Patient ID: " + patientID[i]);

                            break;
                        }
                    }

                    if (!foundPatient) {
                        System.out.println("Patient not found.");
                    }

                    break;

                // BOOK APPOINTMENT
                case 3:

                    System.out.println("\n----- BOOK APPOINTMENT -----");

                    System.out.print("Enter Patient ID: ");
                    ID = s.nextLine();

                    boolean foundForBooking = false;

                    for (int i = 0; i < accountCounter; i++) {

                        if (patientID[i] != null &&
                                patientID[i].equals(ID)) {

                            foundForBooking = true;

                            System.out.println(
                                    "Patient: " + patientName[i]);

                            System.out.print("Enter doctor name: ");
                            doctorName[i] = s.nextLine();

                            System.out.print("Enter appointment date: ");
                            appointmentDate[i] = s.nextLine();

                            System.out.print("Enter appointment time: ");
                            appointmentTime[i] = s.nextLine();

                            // Consultation options
                            System.out.println("\n----- CONSULTATION TYPE -----");
                            System.out.println("1. General Consultation - R350");
                            System.out.println("2. Follow-up Consultation - R250");
                            System.out.println("3. Emergency Consultation - R500");

                            System.out.print("Choose consultation type: ");
                            int consultationChoice = s.nextInt();
                            s.nextLine();

                            switch (consultationChoice) {

                                case 1:
                                    consultationType[i] =
                                            "General Consultation";
                                    consultationPrice[i] = 350.00;
                                    break;

                                case 2:
                                    consultationType[i] =
                                            "Follow-up Consultation";
                                    consultationPrice[i] = 250.00;
                                    break;

                                case 3:
                                    consultationType[i] =
                                            "Emergency Consultation";
                                    consultationPrice[i] = 500.00;
                                    break;

                                default:
                                    System.out.println(
                                            "Invalid consultation type.");
                                    consultationType[i] =
                                            "General Consultation";
                                    consultationPrice[i] = 350.00;
                                    break;
                            }

                            System.out.print("Payment status (Paid/Pending): ");
                            paymentStatus[i] = s.nextLine();

                            System.out.println(
                                    "\nAppointment booked successfully!");

                            System.out.println(
                                    "Doctor: " + doctorName[i]);

                            System.out.println(
                                    "Date: " + appointmentDate[i]);

                            System.out.println(
                                    "Time: " + appointmentTime[i]);

                            System.out.println(
                                    "Consultation: "
                                    + consultationType[i]);

                            System.out.printf(
                                    "Fee: R%.2f%n",
                                    consultationPrice[i]);

                            System.out.println(
                                    "Payment: " + paymentStatus[i]);

                            break;
                        }
                    }

                    if (!foundForBooking) {
                        System.out.println("Patient not found.");
                    }

                    break;

                // VIEW APPOINTMENT
                case 4:

                    System.out.println("\n----- APPOINTMENT DETAILS -----");

                    System.out.print("Enter Patient ID: ");
                    ID = s.nextLine();

                    boolean foundAppointment = false;

                    for (int i = 0; i < accountCounter; i++) {

                        if (patientID[i] != null &&
                                patientID[i].equals(ID)) {

                            foundAppointment = true;

                            if (appointmentDate[i] == null) {

                                System.out.println(
                                        "No appointment booked.");

                            } else {

                                System.out.println(
                                        "\nPatient: " + patientName[i]);

                                System.out.println(
                                        "Doctor: " + doctorName[i]);

                                System.out.println(
                                        "Date: " + appointmentDate[i]);

                                System.out.println(
                                        "Time: " + appointmentTime[i]);

                                System.out.println(
                                        "Consultation: "
                                        + consultationType[i]);

                                System.out.printf(
                                        "Fee: R%.2f%n",
                                        consultationPrice[i]);

                                System.out.println(
                                        "Payment: "
                                        + paymentStatus[i]);
                            }

                            break;
                        }
                    }

                    if (!foundAppointment) {
                        System.out.println("Patient not found.");
                    }

                    break;

                // CANCEL APPOINTMENT
                case 5:

                    System.out.println("\n----- CANCEL APPOINTMENT -----");

                    System.out.print("Enter Patient ID: ");
                    ID = s.nextLine();

                    boolean foundForCancel = false;

                    for (int i = 0; i < accountCounter; i++) {

                        if (patientID[i] != null &&
                                patientID[i].equals(ID)) {

                            foundForCancel = true;

                            if (appointmentDate[i] == null) {

                                System.out.println(
                                        "This patient has no appointment.");

                            } else {

                                appointmentDate[i] = null;
                                appointmentTime[i] = null;
                                doctorName[i] = null;

                                consultationType[i] = null;
                                consultationPrice[i] = 0.00;
                                paymentStatus[i] = null;

                                System.out.println(
                                        "Appointment cancelled successfully!");
                            }

                            break;
                        }
                    }

                    if (!foundForCancel) {
                        System.out.println("Patient not found.");
                    }

                    break;

                // VIEW BILL
                case 6:

                    System.out.println("\n----- PATIENT BILL -----");

                    System.out.print("Enter Patient ID: ");
                    ID = s.nextLine();

                    boolean foundBill = false;

                    for (int i = 0; i < accountCounter; i++) {

                        if (patientID[i] != null &&
                                patientID[i].equals(ID)) {

                            foundBill = true;

                            if (consultationType[i] == null) {

                                System.out.println(
                                        "No bill available. "
                                        + "The patient has no appointment.");

                            } else {

                                System.out.println("\nPatient: "
                                        + patientName[i]);

                                System.out.println("Patient ID: "
                                        + patientID[i]);

                                System.out.println("Consultation: "
                                        + consultationType[i]);

                                System.out.printf(
                                        "Amount: R%.2f%n",
                                        consultationPrice[i]);

                                System.out.println("Payment Status: "
                                        + paymentStatus[i]);
                            }

                            break;
                        }
                    }

                    if (!foundBill) {
                        System.out.println("Patient not found.");
                    }

                    break;

                // EXIT
                case 7:

                    System.out.println(
                            "\nThank you for using the Clinic Appointment System!");

                    again = false;

                    break;

                default:

                    System.out.println(
                            "\nInvalid option. Please try again.");

                    break;
            }
        }
    }

    public static void main(String[] args) {

        loadPatients();
        patientMenu();

    }
}