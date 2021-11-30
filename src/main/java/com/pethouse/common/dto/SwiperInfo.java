package com.pethouse.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SwiperInfo implements Serializable {

    private String petPic;

    private int petId;

    private String openType;

    private String navigatorURL;
}
