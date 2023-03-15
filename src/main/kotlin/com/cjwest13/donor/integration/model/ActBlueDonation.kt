package com.cjwest13.donor.integration.model

import com.opencsv.bean.CsvBindByName
import com.opencsv.bean.CsvDate
import lombok.Data
import java.util.*

@Data
class ActBlueDonation {
    //Receipt ID
    @CsvBindByName(column = "Receipt ID")
    private val receiptId: String? = null

    //Date
    @CsvBindByName(column = "Date")
    @CsvDate("MM/dd/yyy")
    private val date: Date? = null

    //Amount
    @CsvBindByName(column = "Amount")
    private val amount = 0.0

    //Recurring Total Months
    @CsvBindByName(column = "Recurring Total Months")
    private val recurringTotalMonths: String? = null

    //Recurrence Number
    @CsvBindByName(column = "Recurrence Number")
    private val recurrenceNumber = 0

    //Recipient
    @CsvBindByName(column = "Recipient")
    private val recipientName: String? = null

    //Fundraising Page
    @CsvBindByName(column = "Fundraising Page")
    private val fundraisingPage: String? = null

    //Fundraising Partner
    @CsvBindByName(column = "Fundraising Partner")
    private val fundraisingPartner: String? = null

    //Reference Code 2
    @CsvBindByName(column = "Reference Code 2")
    private val refCode2: String? = null

    //Reference Code
    @CsvBindByName(column = "Reference Code")
    private val refCode1: String? = null

    //Donor First Name
    @CsvBindByName(column = "Donor First Name")
    private val donorFirstName: String? = null

    //Donor Last Name
    @CsvBindByName(column = "Donor Last Name")
    private val donorLastName: String? = null

    //Donor Addr1
    @CsvBindByName(column = "Donor Addr1")
    private val donorAddressLine1: String? = null

    //Donor Addr2
    @CsvBindByName(column = "Donor Addr2")
    private val donorAddressLine2: String? = null

    //Donor City
    @CsvBindByName(column = "Donor City")
    private val donorCity: String? = null

    //Donor State
    @CsvBindByName(column = "Donor State")
    private val donorState: String? = null

    //Donor ZIP
    @CsvBindByName(column = "Donor ZIP")
    private val donorZip: String? = null

    //Donor Country
    @CsvBindByName(column = "Donor Country")
    private val donorCountry: String? = null

    //Donor Occupation
    @CsvBindByName(column = "Donor Occupation")
    private val donorOccupation: String? = null

    //Donor Employer
    @CsvBindByName(column = "Donor Employer")
    private val donorEmployer: String? = null

    //Donor Email
    @CsvBindByName(column = "Donor Email")
    private val donorEmail: String? = null

    //Donor Phone
    @CsvBindByName(column = "Donor Phone")
    private val donorPhone: String? = null

    //New Express Signup
    @CsvBindByName(column = "New Express Signup")
    private val newExpressSignup: String? = null

    //Comments
    @CsvBindByName(column = "Comments")
    private val comments: String? = null

    //Check Number
    @CsvBindByName(column = "Check Number")
    private val checkNumber: String? = null

    //Check Date
    @CsvBindByName(column = "Check Date")
    private val checkDate: String? = null

    //Employer Addr1
    @CsvBindByName(column = "Employer Addr1")
    private val employerAddressLine1: String? = null

    //Employer Addr2
    @CsvBindByName(column = "Employer Addr2")
    private val employerAddressLine2: String? = null

    //Employer City
    @CsvBindByName(column = "Employer City")
    private val employerCity: String? = null

    //Employer State
    @CsvBindByName(column = "Employer State")
    private val employerState: String? = null

    //Employer ZIP
    @CsvBindByName(column = "Employer ZIP")
    private val employerZip: String? = null

    //Employer Country
    @CsvBindByName(column = "Employer Country")
    private val employerCountry: String? = null

    //Donor ID
    @CsvBindByName(column = "Donor ID")
    private val donorID: String? = null

    //Fundraiser ID
    @CsvBindByName(column = "Fundraiser ID")
    private val fundraiserID: String? = null

    //Fundraiser Recipient ID
    @CsvBindByName(column = "Fundraiser Recipient ID")
    private val fundraiserRecipientID: String? = null

    //Fundraiser Contact Email
    @CsvBindByName(column = "Fundraiser Contact Email")
    private val fundraiserContactEmail: String? = null

    //Fundraiser Contact First Name
    @CsvBindByName(column = "Fundraiser Contact First Name")
    private val fundraiserContactFirstName: String? = null

    //Fundraiser Contact Last Name
    @CsvBindByName(column = "Fundraiser Contact Last Name")
    private val fundraiserContactLastName: String? = null

    //Partner ID
    @CsvBindByName(column = "Partner ID")
    private val partnerID: String? = null

    //Partner Contact Email
    @CsvBindByName(column = "Partner Contact Email")
    private val partnerContactEmail: String? = null

    //Partner Contact First Name
    @CsvBindByName(column = "Partner Contact First Name")
    private val partnerContactFirstName: String? = null

    //Partner Contact Last Name
    @CsvBindByName(column = "Partner Contact Last Name")
    private val partnerContactLastName: String? = null

    //Reserved
    @CsvBindByName(column = "Reserved")
    private val reserved: String? = null

    //Lineitem ID
    @CsvBindByName(column = "Lineitem ID")
    private val lineitemID: String? = null

    //AB Test Name
    @CsvBindByName(column = "AB Test Name")
    private val aBTestName: String? = null

    //AB Variation
    @CsvBindByName(column = "AB Variation")
    private val aBVariation: String? = null

    //Recipient Committee
    @CsvBindByName(column = "Recipient Committee")
    private val recipientCommittee: String? = null

    //Recipient ID
    @CsvBindByName(column = "Recipient ID")
    private val recipientID: String? = null

    //Recipient Gov ID
    @CsvBindByName(column = "Recipient Gov ID")
    private val recipientGovID: String? = null

    //Recipient Election
    @CsvBindByName(column = "Recipient Election")
    private val recipientElection: String? = null

    //Reserved
    @CsvBindByName(column = "Reserved")
    private val reserved2: String? = null

    //Payment ID
    @CsvBindByName(column = "Payment ID")
    private val paymentID: String? = null

    //Payment Date
    @CsvBindByName(column = "Payment Date")
    @CsvDate("MM/dd/yyyy HH:mm")
    private val paymentDate: Date? = null

    //Disbursement ID
    @CsvBindByName(column = "Disbursement ID")
    private val disbursementID: String? = null

    //Disbursement Date
    @CsvBindByName(column = "Disbursement Date")
    @CsvDate("MM/dd/yyyy HH:mm")
    private val disbursementDate: Date? = null

    //Recovery ID
    @CsvBindByName(column = "Recovery ID")
    private val recoveryID: String? = null

    //Recovery Date
    @CsvBindByName(column = "Recovery Date")
    @CsvDate("MM/dd/yyyy HH:mm")
    private val recoveryDate: Date? = null

    //Refund ID
    @CsvBindByName(column = "Refund ID")
    private val refundID: String? = null

    //Refund Date
    @CsvBindByName(column = "Refund Date")
    @CsvDate("MM/dd/yyyy HH:mm")
    private val refundDate: Date? = null

    //Fee
    @CsvBindByName(column = "Fee")
    private val fee = 0.0

    //Recur Weekly
    @CsvBindByName(column = "Recur Weekly")
    private val recurWeekly: String? = null

    //ActBlue Express Lane
    @CsvBindByName(column = "ActBlue Express Lane")
    private val actBlueExpressLane: String? = null

    //Reserved
    @CsvBindByName(column = "Reserved")
    private val reserved3: String? = null

    //Card Type
    @CsvBindByName(column = "Card Type")
    private val cardType: String? = null

    //Reserved
    @CsvBindByName(column = "Reserved")
    private val reserved4: String? = null

    //Reserved
    @CsvBindByName(column = "Reserved")
    private val reserved5: String? = null

    //Reserved
    @CsvBindByName(column = "Reserved")
    private val reserved6: String? = null

    //Reserved
    @CsvBindByName(column = "Reserved")
    private val reserved7: String? = null

    //Mobile
    @CsvBindByName(column = "Mobile")
    private val mobile: String? = null

    //Recurring Upsell Shown
    @CsvBindByName(column = "Recurring Upsell Shown")
    private val recurringUpsellShown: String? = null

    //Recurring Upsell Succeeded
    @CsvBindByName(column = "Recurring Upsell Succeeded")
    private val recurringUpsellSucceeded: String? = null

    //Double Down
    @CsvBindByName(column = "Double Down")
    private val doubleDown: String? = null

    //Smart Recurring
    @CsvBindByName(column = "Smart Recurring")
    private val smartRecurring: String? = null

    //Monthly Recurring Amount
    @CsvBindByName(column = "Monthly Recurring Amount")
    private val monthlyRecurringAmount: String? = null

    //Apple Pay
    @CsvBindByName(column = "Apple Pay")
    private val applePay: String? = null

    //Card Replaced by Account Updater
    @CsvBindByName(column = "Card Replaced by Account Updater")
    private val cardReplacedbyAccountUpdater: String? = null

    //ActBlue Express Donor
    @CsvBindByName(column = "ActBlue Express Donor")
    private val actBlueExpressDonor: String? = null

    //Custom Field 1 Label
    @CsvBindByName(column = "Custom Field 1 Label")
    private val customField1Label: String? = null

    //Custom Field 1 Value
    @CsvBindByName(column = "Custom Field 1 Value")
    private val customField1Value: String? = null

    //Donor US Passport Number
    @CsvBindByName(column = "Donor US Passport Number")
    private val donorUSPassportNumber: String? = null

    //Text Message Opt In
    @CsvBindByName(column = "Text Message Opt In")
    private val textMessageOptIn: String? = null

    //Gift Identifier
    @CsvBindByName(column = "Gift Identifier")
    private val giftIdentifier: String? = null

    //Gift Declined
    @CsvBindByName(column = "Gift Declined")
    private val giftDeclined: String? = null

    //Shipping Addr1
    @CsvBindByName(column = "Shipping Addr1")
    private val shippingAddressLine1: String? = null

    //Shipping City
    @CsvBindByName(column = "Shipping City")
    private val shippingCity: String? = null

    //Shipping State
    @CsvBindByName(column = "Shipping State")
    private val shippingState: String? = null

    //Shipping ZIP
    @CsvBindByName(column = "Shipping ZIP")
    private val shippingZip: String? = null

    //Shipping Country
    @CsvBindByName(column = "Shipping Country")
    private val shippingCountry: String? = null

    //Weekly Recurring Amount
    @CsvBindByName(column = "Weekly Recurring Amount")
    private val weeklyRecurringAmount: String? = null

    //Smart Boost Amount
    @CsvBindByName(column = "Smart Boost Amount")
    private val smartBoostAmount: String? = null

    //Smart Boost Shown
    @CsvBindByName(column = "Smart Boost Shown")
    private val smartBoostShown: String? = null
}