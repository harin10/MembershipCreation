package com.samscash.membership.create.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CreateRequest {
    private String Type;
    private Boolean businessCredit;
    private Boolean consumerCredit;
    private List<ChildMembership> children;
}
