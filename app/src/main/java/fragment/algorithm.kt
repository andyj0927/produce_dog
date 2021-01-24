package com.junga.cattest.fragment

open class Algorithm(var eiScore: Int, var snScore: Int, var tfScore: Int, var jpScore: Int) {
    var ei:Int = eiScore
    var sn:Int = snScore
    var tf:Int = tfScore
    var jp:Int = jpScore

    @JvmName("getEi1")
    public fun getEi() : Int{
        return ei
    }

    @JvmName("getSn1")
    public fun getSn() : Int{
        return sn
    }

    @JvmName("getTf1")
    public fun getTf() : Int{
        return tf
    }

    @JvmName("getJp1")
    public fun getJp() : Int{
        return jp
    }

    public fun incrementEi(){
        ei ++ //높을 수록 e
    }

    public fun incrementSn(){
        sn ++ //높을 수록 s
    }

    public fun incrementTf(){
        tf ++ //높을 수록 t
    }

    public fun incrementJp() {
        jp ++ //높을 수록 j
    }

    public fun evaluateMBTI(): String {
        if(ei >= 2 && sn >= 2 && tf >= 2 && jp >= 2) {
            return "ESTJ" // result fragment.kt 부분을 해당 유형에 맞춰 변경하였음
        } else if (ei < 2 && sn >= 2 && tf >= 2 && jp >= 2) {
            return "ISTJ"
        } else if (ei < 2 && sn < 2 && tf >= 2 && jp >= 2) {
            return "INTJ"
        } else if (ei < 2 && sn < 2 && tf < 2 && jp >= 2) {
            return "INFJ"
        } else if (ei < 2 && sn < 2 && tf < 2 && jp < 2) {
            return "INFP"
        } else if (ei >= 2 && sn < 2 && tf < 2 && jp < 2) {
            return "ENFP"
        } else if (ei >= 2 && sn >= 2 && tf < 2 && jp < 2) {
            return "ESFP"
        } else if (ei >= 2 && sn >= 2 && tf >= 2 && jp < 2) {
            return "ESTP"
        } else if (ei >= 2 && sn >= 2 && tf < 2 && jp >= 2) {
            return "ESFJ"
        } else if (ei >= 2 && sn < 2 && tf >= 2 && jp >= 2) {
            return "ENTJ"
        } else if (ei >= 2 && sn < 2 && tf >= 2 && jp < 2) {
            return "ENTP"
        } else if (ei < 2 && sn < 2 && tf >= 2 && jp < 2) {
            return "INTP"
        } else if (ei < 2 && sn >= 2 && tf >= 2 && jp < 2) {
            return "ISTP"
        } else if (ei < 2 && sn >= 2 && tf < 2 && jp < 2) {
            return "ISFP"
        } else if (ei < 2 && sn >= 2 && tf < 2 && jp >= 2) {
            return "ISFJ"
        } else {
            return "ENFJ"
        }
    }

}
