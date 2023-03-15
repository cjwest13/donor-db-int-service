package com.cjwest13.donor.integration.exception

class BloomerangException : Exception {
    constructor(errorMessage: String?) : super(errorMessage) {}
    constructor(errorMessage: String?, throwable: Throwable?) : super(errorMessage, throwable) {}
}