package com.wss.wss_api_362.model;

import javax.persistence.*;

@Entity
@Table(name = "recibo_pago")
public class ReciboPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
}
