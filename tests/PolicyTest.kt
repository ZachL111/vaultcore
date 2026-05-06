fun main() {
    val signalcase_1 = Signal(68, 103, 13, 5, 6)
    check(Policy.score(signalcase_1) == 216)
    check(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(63, 98, 16, 11, 10)
    check(Policy.score(signalcase_2) == 192)
    check(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(80, 79, 13, 20, 12)
    check(Policy.score(signalcase_3) == 192)
    check(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(67, 24, 24, 81)
    check(DomainReviewLens.score(domainReview) == 167)
    check(DomainReviewLens.lane(domainReview) == "ship")
}
