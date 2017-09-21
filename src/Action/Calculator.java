package Action;

import VO.Calculator1;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Administrator on 2017/9/18.
 */
public class Calculator extends ActionSupport implements ModelDriven<Calculator1> {


    private Calculator1 cal=new Calculator1();

    public String calculate() {
        float result = 0;

         switch (cal.getOp().charAt(0)) {


            case '+':result=cal.getNum1()+cal.getNum2();break;
            case '-':result=cal.getNum1()-cal.getNum2();break;
            case '*':result=cal.getNum1()*cal.getNum2();break;
            case '/':result=cal.getNum1()/cal.getNum2();break;

        }

        ActionContext.getContext().put("result",result);
        return "calRight";
    }

    @Override
    public Calculator1 getModel() {
        return cal;
    }
}