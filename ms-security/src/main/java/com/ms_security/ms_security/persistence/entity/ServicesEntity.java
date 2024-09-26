package com.ms_security.ms_security.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SERVICES", schema = "ECOMERS_WITH_INVENTORY")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ServicesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERVICES_ID", nullable = false)
    private Long id;
    @Column(name = "NAME_SERVICE", nullable = false)
    private String name;
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
    @Column(name = "IMAGE_URL", nullable = false)
    private String imageUrl;
    @Column(name = "STATUS", nullable = false)
    private Boolean status;
    @Column(name = "CREATE_USER")
    private String createUser;
    @Column(name = "UPDATE_USER")
    private String updateUser;
    @Column(name = "DATE_TIME_CREATION")
    private String dateTimeCreation;
    @Column(name = "DATE_TIME_UPDATE")
    private String dateTimeUpdate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_CODE", referencedColumnName = "PRODUCT_CODE", insertable = false, updatable = false)
    private InventoryEntity inventory;
    @Column(name = "PRODUCT_CODE")
    private Long inventoryCodeId;
}
