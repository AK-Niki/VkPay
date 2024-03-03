import org.junit.Assert
import org.junit.Test

class MainKtTest {
    @Test
    fun calculateCommission_ExceedsMonthlyLimit_Mastercard_ReturnsErrorMessage() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_Visa_ReturnsErrorMessage() {
        val cardType = "Visa"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_VKPay_ReturnsErrorMessage() {
        val cardType = "VK Pay"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_MIR_ReturnsErrorMessage() {
        val cardType = "MIR"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_Maestro_ReturnsErrorMessage() {
        val cardType = "Maestro"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_Unknown_ReturnsErrorMessage() {
        val cardType = "Unknown"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    // Превышение ежедневного лимита

    @Test
    fun calculateCommission_ExceedsDailyLimit_Mastercard_ReturnsErrorMessage() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDailyLimit_Visa_ReturnsErrorMessage() {
        val cardType = "Visa"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDailyLimit_MIR_ReturnsErrorMessage() {
        val cardType = "MIR"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDailyLimit_Maestro_ReturnsErrorMessage() {
        val cardType = "Maestro"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDailyLimit_VKPay_ReturnsErrorMessage() {
        val cardType = "VK Pay"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDailyLimit_Unknown_ReturnsErrorMessage() {
        val cardType = "Unknown"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    // Успешная транзакция без комиссии

    @Test
    fun calculateCommission_SuccessfulTransaction_MastercardInRange_NoCommission() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 55000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: 0", result)
    }

    @Test
    fun calculateCommission_SuccessfulTransaction_VisaBelow35_NoCommission() {
        val cardType = "Visa"
        val totalTransfersThisMonth = 55000
        val transferAmount = 20
        val expectedCommission = 35

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommission_SuccessfulTransaction_VKPay_NoCommission() {
        val cardType = "VK Pay"
        val totalTransfersThisMonth = 55000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: 0", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_Mastercard_RrnsorMessage() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_Visa_ReturrrorMessage() {
        val cardType = "Visa"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDailyLimit_Mrcard_ReturnsErrorMessage() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_MastercardInRange_NoCommission() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 50000
        val transferAmount = 30000
        val expectedCommission = 0

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }
    @Test
    fun calculateCommission_Mastercard_OutOfRange_Commission() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 50000
        val transferAmount = 76000
        val expectedCommission = 476

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }
    @Test
    fun calculateCommission_UnknownCardType_ReturnsErrorMessage() {
        val cardType = "Unknown"
        val totalTransfersThisMonth = 55000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция не выполнена успешно", result)
    }

    @Test
    fun calculateCommission_ExceedsMonyLimit_Mastercard_ReturnsErrorMessage() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_Visa_RetErrorMessage() {
        val cardType = "Visa"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_VKPayturnsErrorMessage() {
        val cardType = "VK Pay"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_MIR_Retussage() {
        val cardType = "MIR"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceelyLimit_Maestr_ReturnsErrorMessage() {
        val cardType = "Maestro"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateComUnknown_ReturnsErrorMessage() {
        val cardType = "Unknown"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    // Превышение ежедневного лимита

    @Test
    fun DailyLimit_Mastercard_ReturnsErrorMessage() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommturnsErrorMessage() {
        val cardType = "Visa"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }
    @Test
    fun calculateComlyLimit_MIR_ReturnsErrorMessage() {
        val cardType = "MIR"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCon_ExceedsDailyLimit_Maestro_ReturnsErrorMessage() {
        val cardType = "Maestro"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExDailyLimit_VKPay_ReturnsErrorMessage() {
        val cardType = "VK Pay"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDaLimit_Unknown_ReturnsErrorMessage() {
        val cardType = "Unknown"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    // Успешная транзакция без комиссии

    @Test
    fun calculateCommission_MasnRange_NoCommission() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 50000
        val transferAmount = 30000
        val expectedCommission = 0

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommission_VisaLessThan35_NoCommission() {
        val cardType = "Visa"
        val totalTransfersThisMonth = 0
        val transferAmount = 34
        val expectedCommission = 35

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }
    @Test
    fun calculateCommission_ExceedsMoyLimit_Mastercard_ReturnsErrorMessage() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLiMessage() {
        val cardType = "Visa"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_VKPrrorMessage() {
        val cardType = "VK Pay"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsMonthlyLimit_MIR_RerMessage() {
        val cardType = "MIR"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_Exceemit_Maestro_ReturnsErrorMessage() {
        val cardType = "Maestro"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedslyLimit_Unknown_ReturnsErrorMessage() {
        val cardType = "Unknown"
        val totalTransfersThisMonth = 650000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен месячный лимит", result)
    }

    // Превышение ежедневного лимита

    @Test
    fun calculateCommission_ExceedsilyLimit_Mastercard_ReturnsErrorMessage() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDailyLimit_Visa_turnsErrorMessage() {
        val cardType = "Visa"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDailyLimit_MIR_RturnsErrorMessage() {
        val cardType = "MIR"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDailyLimit_Mestro_ReturnsErrorMessage() {
        val cardType = "Maestro"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDailyLiit_VKPay_ReturnsErrorMessage() {
        val cardType = "VK Pay"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    @Test
    fun calculateCommission_ExceedsDalyLimit_Unknown_ReturnsErrorMessage() {
        val cardType = "Unknown"
        val totalTransfersThisMonth = 0
        val transferAmount = 160000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Превышен суточный лимит", result)
    }

    // Успешная транзакция без комиссии

    @Test
    fun calculateCommission_MastercardInRange_NoCommision() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 50000
        val transferAmount = 30000
        val expectedCommission = 0

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    // Успешная транзакция с комиссией

    @Test
    fun calculateCommission_Mastercard_OutOfRane_Commission() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 50000
        val transferAmount = 76000
        val expectedCommission = 476

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    // Неудачная транзакция

    @Test
    fun calculateCommission_UnknownCardType_ReturnErrorMessage() {
        val cardType = "Unknown"
        val totalTransfersThisMonth = 55000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция не выполнена успешно", result)
    }

    @Test
    fun calculateCommission_InvalidCardType_ReturnsErrorMessage() {
        val cardType = ""
        val totalTransfersThisMonth = 55000
        val transferAmount = 30000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция не выполнена успешно", result)
    }

    @Test
    fun calculateCommission_ReturnsErrorMessage() {
        val cardType = "Visa"
        val totalTransfersThisMonth = -36
        val transferAmount = 30000
        val expectedCommission = 225

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommission_ReturnsError() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = -36
        val transferAmount = 30000
        val expectedCommission = 0

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommission_Error() {
        val cardType = "VK Pay"
        val totalTransfersThisMonth = -36
        val transferAmount = 30000
        val expectedCommission = 0

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommissionMAS() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 10000
        val transferAmount = 50000
        val expectedCommission = 0

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommissionMAE4() {
        val cardType = "Maestro"
        val totalTransfersThisMonth = 10000
        val transferAmount = 50000
        val expectedCommission = 0

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateMAE2Commission() {
        val cardType = "Maestro"
        val totalTransfersThisMonth = 10000
        val transferAmount = 10
        val expectedCommission = 20

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommissionMAE() {
        val cardType = "Maestro"
        val totalTransfersThisMonth = 10000
        val transferAmount = 80000
        val expectedCommission = 500

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateMAS1Commission() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 10000
        val transferAmount = 80000
        val expectedCommission = 500

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateMASCommission() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 10000
        val transferAmount = 10
        val expectedCommission = 20

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommission_VK() {
        val cardType = "VK Pay"
        val totalTransfersThisMonth = 55000
        val transferAmount = -8
        val expectedCommission = 0

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommission_MAE() {
        val cardType = "Maestro"
        val totalTransfersThisMonth = 55000
        val transferAmount = -8
        val expectedCommission = 20

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommission_MAS() {
        val cardType = "Mastercard"
        val totalTransfersThisMonth = 55000
        val transferAmount = -8
        val expectedCommission = 20

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommission_MIR() {
        val cardType = "MIR"
        val totalTransfersThisMonth = 55000
        val transferAmount = -8
        val expectedCommission = 35

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommission_VIS() {
        val cardType = "Visa"
        val totalTransfersThisMonth = 55000
        val transferAmount = -8
        val expectedCommission = -3_000_000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция выполнена успешно. Комиссия: $expectedCommission", result)
    }

    @Test
    fun calculateCommissionNO() {
        val cardType = "0"
        val totalTransfersThisMonth = 10000
        val transferAmount = 50000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция не выполнена успешно", result)
    }

    @Test
    fun calculateCommissionNO1() {
        val cardType = "56"
        val totalTransfersThisMonth = 10000
        val transferAmount = 50000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция не выполнена успешно", result)
    }

    @Test
    fun calculateCommissionNO2() {
        val cardType = "Радриго"
        val totalTransfersThisMonth = 10000
        val transferAmount = 50000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция не выполнена успешно", result)
    }

    @Test
    fun calculateCommissionNO3() {
        val cardType = "-9"
        val totalTransfersThisMonth = 10000
        val transferAmount = 50000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция не выполнена успешно", result)
    }

    @Test
    fun calculateCommissionNO4() {
        val cardType = " "
        val totalTransfersThisMonth = 10000
        val transferAmount = 50000

        val result = calculateCommission(cardType, totalTransfersThisMonth, transferAmount)

        Assert.assertEquals("Транзакция не выполнена успешно", result)
    }
}

