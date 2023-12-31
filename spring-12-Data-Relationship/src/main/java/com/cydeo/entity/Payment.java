package com.cydeo.entity;

import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name= "Payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Status paymentStatus;

    //@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_detail_id")
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private PaymentDetail paymentDetail;

    @ManyToOne
    private Merchant merchant;

    public Payment(LocalDate createDate, BigDecimal amount, Status paymentStatus) {
        this.createdDate = createDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
