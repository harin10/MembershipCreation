package com.samscash.membership.create.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ChildMembership {
    private Boolean isAddOn;
    private Boolean consumerCredit;
    private Boolean authBuyer;
    private ChildMembership child;

}
