data class Order(
    val orderId: String,
    val customer: Customer,
    val items: List<Item>,
    var status: String,
    val deliveryAddress: String
) {
    fun updateStatus(newStatus: String) {
        status = newStatus
    }
}
