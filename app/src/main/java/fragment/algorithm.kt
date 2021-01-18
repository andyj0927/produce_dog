package com.junga.temptest.fragment

class algorithm(var eiScore: Int, var snScore: Int, var tfScore: Int, var jpScore: Int) {
    public var ei:Int = 0
    public var sn:Int = 0
    public var tf:Int = 0
    public var jp:Int = 0

    @JvmName("getEi1")
    public fun getEi() : Int{
        return ei
    }

    @JvmName("getSn1")
    public fun getSn() : Int{
        return sn
    }

    public fun setTf() : Int{
        return tf
    }

    @JvmName("getJp1")
    public fun getJp() : Int{
        return jp
    }

    public fun incrementEi(){
        ei ++
    }

    public fun incrementSn(){
        sn ++
    }

    public fun incrementTf(){
        tf ++
    }

    public fun incrementJp() {
        jp ++
    }

    public fun evaluateMBTI(): String {
        if(ei >= 2 && sn >= 2 && tf >= 2 && jp >= 2) {
            return "ESTJ"// result fragment.kt 부분 옵션애 맞춰서 변경해주어야함
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