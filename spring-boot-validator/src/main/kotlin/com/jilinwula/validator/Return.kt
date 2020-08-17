package com.jilinwula.validator

import lombok.Data

@Data
class Return {
    var code = 0
    var data: String? = null
    var msg: String? = null

    fun error(data: String?, msg: String?) {
        val r = Return()
        r.code = -1
        r.data = data
        r.msg = msg
        throw ValidatorException(r)
    }


    fun success(): Return {
        val r = Return()
        r.code = 0
        return r
    }

}