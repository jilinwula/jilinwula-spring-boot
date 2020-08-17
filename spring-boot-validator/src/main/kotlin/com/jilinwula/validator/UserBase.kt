package com.jilinwula.validator

import lombok.Data
import org.springframework.stereotype.Component
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull

@Component
@Data
class UserBase {
    @NotNull(message = "账号不能为空")
    var username: String? = null

    @NotNull(message = "密码不能为空")
    var password: String? = null

    @NotNull(message = "角色不能为空")
    @Min(value = 1, message = "密码必须大于等于1")
    @Max(value = 5, message = "密码必须小于等于5")
    var roleId: Long? = null
}