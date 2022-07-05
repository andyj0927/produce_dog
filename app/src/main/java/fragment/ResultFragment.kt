package fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.cattest.R
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {

    var option = "cat"
//    var displayMessage: String? = ""

    lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        option = arguments?.getString("Data")?:"cat"
//        displayMessage = arguments?.getString("message")

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setResult(option)
//        user_name.text=displayMessage

        btn_ot.setOnClickListener{
            navController.navigate(R.id.action_resultFragment2_to_viewAllFragment)
        }
    }

    private fun setResult(type_c : String){

        when(type_c){
            "ISTJ" -> {
                tv_main.text = "시베리안 허스키"
                tv_sub.text = "현실적이고 책임감 넘치는 당신.\n남들이 잊어버리는 사소한 것도 잘 기억하는 타입입니다.\n\n신사적이고 유순한 허스키와 잘 어울리네요!"
                iv_main.setImageResource(R.drawable.husky)
            }
            "ESTP" -> {
                tv_main.text = "래브라도 리트리버"
                tv_sub.text = "과묵하고 분석적인 당신.\n적응력이 강하고 효율적으로 행동하며 독립적인 타입입니다.\n\n적응력이 뛰어나고 주인을 잘 따르는 래브라도 리트리버와 잘 어울리네요!"
                iv_main.setImageResource(R.drawable.rebrado)
            }
            "ISTP" -> {
                tv_main.text = "비숑프리제"
                tv_sub.text = "자신감 넘치고 엄청난 활동성을 자랑하는 당신.\n남들에 비해 다양한 것들을 쉽게 배우는 타입입니다.\n\n에너자이저 치어리더인 비숑프리제와 잘 어울리네요!"
                iv_main.setImageResource(R.drawable.bisong)
            }
            "ESTJ" -> {
                tv_main.text = "보더 콜리"
                tv_sub.text = "체계적으로 일하고 규칙을 준수하는 당신.\n기억력도 좋고 활동성이 있어 사업가의 자질이 다분합니다.\n\n지능이 높고 수준높은 보더 콜리와 잘 어울리네요!"
                iv_main.setImageResource(R.drawable.boarder)
            }
            "INTJ" -> {
                tv_main.text = "잭 러셀 테리어"
                tv_sub.text = "인내심이 많고 통찰력이 뛰어나며 화합을 추구하는 당신.\n남들보다 풍부한 내적생활을 소유하고 있는 타입입니다.\n\n예리하고 민첩한 잭 러셀 테리어와 잘 어울리네요!"
                iv_main.setImageResource(R.drawable.jack)
            }
            "INTP" -> {
                tv_main.text = "비글"
                tv_sub.text = "자신이 관계하는 일이나 사람에 대하여 책임감이 강하고 성실한 당신.\n마음이 따뜻하고 조용한 타입입니다.\n\n똑똑하고 영리한 비글과 잘 어울리네요!"
                iv_main.setImageResource(R.drawable.beagle)
            }
            "ENTP" -> {
                tv_main.text = "프렌치 불도그"
                tv_sub.text = "따뜻하고 활기가 넘치며 상상력이 풍부한 당신.\n\n창의적이며 항상 새로운 가능성을 찾고 시도하는 타입입니다.\n코믹하고 창의적인 고집쟁이 프렌치 불도그와 잘 어울리네요!"
                iv_main.setImageResource(R.drawable.bulldog)
            }
            "ENTJ" -> {
                tv_main.text = "셰퍼드"
                tv_sub.text = "따뜻하고 적극적이며 책임감이 강한 당신.\n상당히 이타적이고 사교성이 풍부한 타입입니다.\n\n지능과 체력, 사교성이 높은 셰퍼드와 잘 어울리네요."
                iv_main.setImageResource(R.drawable.shapu)
            }
            "INFJ" -> {
                tv_main.text = "진돗개"
                tv_sub.text = "차분하고 헌신적이며 혼자 있는 것을 좋아하는 당신.\n규칙적이고 일상적인 환경을 선호하는 타입입니다.\n\n깔끔하고 예민하며 게이름을 피우지 않는 진돗개과 잘 어울리네요."
                iv_main.setImageResource(R.drawable.jindo)
            }
            "ENFP" -> {
                tv_main.text = "퍼그"
                tv_sub.text = "온화하고 우아하며 타인을 존중하는데 능숙한 당신.\n조용하고 부드러운 이미지를 갖고 있군요.\n\n개성이 풍부한 퍼그과 잘 어울리네요."
                iv_main.setImageResource(R.drawable.pug)
            }
            "INFP" -> {
                tv_main.text = "푸들"
                tv_sub.text = "적극적이고 활발하여 주위에 사람이 많은 당신.\n탐험을 좋아하고 매우 사교적이며 장난기 넘치는 타입입니다.\n\n상호작용 잘하는 높은 지능을 가진 푸들과 잘 어울리네요."
                iv_main.setImageResource(R.drawable.puddle)
            }
            "ENFJ" -> {
                tv_main.text = "골든 리트리버"
                tv_sub.text = "사람들과 함께 하는 것을 좋아하며 애정이 넘치고 친절한 당신.\n\n혼자 있는 것보다 다른 사람들과 관계에서 행복을 찾는 타입입니다.\n짝궁을 배려하고 협업하길 좋아하는 골든 리트리버와 잘 어울리네요."
                iv_main.setImageResource(R.drawable.gold)
            }
            "ISFJ" -> {
                tv_main.text = "슈나우저"
                tv_sub.text = "전략적 사고에 뛰어나며 풍부한 지식을 소유하고 있는 당신.\n호기심이 많고 이상적이며 야망이 가득한 사람이군요.\n\n활발하며 눈치빠른 슈나우저과 잘 어울리네요."
                iv_main.setImageResource(R.drawable.suna)
            }
            "ISFP" -> {
                tv_main.text = "시바견"
                tv_sub.text = "창의적이고 독창적이며 지적 호기심이 가득한 당신.\n논리적이며 자신의 관심사에 몰두하는, 전형적인 연구가 타입입니다.\n\n태평하고 느긋하며 자유로운 영혼을 가진 시바견과 잘 어울리네요."
                iv_main.setImageResource(R.drawable.siba)
            }
            "ESFP" -> {
                tv_main.text = "웰시코기"
                tv_sub.text = "박학다식하고 통찰력이 뛰어나며, 다방면에 관심이 많은 당신.\n\n모험심이 강하며 자신의 가치관이 매우 뚜렷한 타입입니다.\n호기심 많고 겁 없이 뛰어 노는 웰시코기와 잘 어울리네요."
                iv_main.setImageResource(R.drawable.well
                )
            }
            "ESFJ" -> {
                tv_main.text = "닥스훈트"
                tv_sub.text = "성취 가능한 도전에 매력을 느끼며 감정 표현에 있어 솔직한 당신.\n통솔력과 전략적 사고, 장기적인 안목을 모두 갖춘 지도자 타입입니다.\n\n아기같고 애교가 많은 닥스훈트와 잘 어울리네요."
                iv_main.setImageResource(R.drawable.dach)
            }
        }
    }

}
