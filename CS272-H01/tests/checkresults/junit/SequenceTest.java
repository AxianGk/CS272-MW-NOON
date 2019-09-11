package checkresults.junit;import static checkresults.ReflectionSupport.create;
import static checkresults.ReflectionSupport.invoke;import static org.junit
.Assert.*;import org.junit.Before;import org.junit.BeforeClass;import org.junit
.FixMethodOrder;import org.junit.runners.MethodSorters;import checkresults
.AbstractClassDefinitionTest;@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SequenceTest extends AbstractClassDefinitionTest{public final 
static String hwKey = "H01-D"; @BeforeClass public static void initializeTests(
)throws Exception{className = "occ.cs272.h01.Sequence";init();}public 
SequenceTest(){getTests(getClass());constructorData = new String[][]{{"int[]"},
};}public void _test_1(){checkSlice1(3,"{4, 5}");}public void _test_2(){
checkSlice1(-1, "{5}");}public void _test_3(){checkSlice1(0,"{1, 2, 3, 4, 5}");
}public void _test_4(){checkSlice1(1,"{2, 3, 4, 5}");}public void _test_5(){ 
checkSlice1(2,"{3, 4, 5}");}public void _test_6(){checkSlice1(4,"{5}");}public 
void _test_7(){checkSlice1(5,"{}");}public void _test_8(){checkSlice1Throws(6);
}public void _test_9(){checkSlice1Throws(-6);}public void _test_10(){checkSlice1
(-2,"{4, 5}");}public void _test_11(){checkSlice1(-3,"{3, 4, 5}");}public void 
_test_12(){checkSlice1(-4,"{2, 3, 4, 5}");}public void _test_13(){checkSlice1(
-5,"{1, 2, 3, 4, 5}");}public void _test_14(){checkSlice2(0,5,"{1, 2, 3, 4, 5}"
);}public void _test_15(){checkSlice2(1,4,"{2, 3, 4}");}public void _test_16(){
checkSlice2(2,3,"{3}");}public void _test_17(){checkSlice2(3,3,"{}");}public 
void _test_18(){checkSlice2Throws(3,2);}public void _test_19(){checkSlice3(0,5,
2,"{1, 3, 5}");}public void _test_20(){checkSlice3(0,5,3,"{1, 4}");}public void 
_test_21(){checkSlice3(1,5,3,"{2, 5}");}public void _test_22(){checkSlice3(-1,-
6,-1,"{5, 4, 3, 2, 1}");}private static int[] array = {1, 2, 3, 4, 5};@Before
public void setup(){obj=create(thisClass,array);}private void checkSlice1(int 
start,String expected){String msg="For "+obj+".slice("+start+")";Object[] args=
{start};String actual=(invoke(obj,Object.class,"slice",args)).toString();
assertEquals(msg+"->",expected,actual);out("Correctness: "+msg+"->"+ actual);}
private void checkSlice2(int start,int end,String expected){String msg= "For "+
obj+".slice("+start+", "+end+")";Object[] args={start,end};String actual=(invoke
(obj,Object.class,"slice",args)).toString();assertEquals(msg+"->",expected,
actual);out("Correctness: "+msg+"->"+actual);}private void checkSlice3(int start
,int end,int step,String expected){String msg ="For "+obj+".slice("+start+", "+
end+", "+step+")";Object[] args={start,end,step};String actual=(invoke(obj,
Object.class,"slice",args)).toString();assertEquals(msg+"->",expected,actual);
out("Correctness: "+msg+"->"+actual);}private void checkSlice1Throws(int start)
{Object[] args={start};String msg="For "+obj+".slice("+start+")";try{invoke(obj, 
Object.class,"slice",args);fail(msg+" should throw exception but does not.");}
catch(Exception e){out("Correctness: "+msg+" correctly throws exception.");}}
private void checkSlice2Throws(int start,int end){Object[] args={start,end};
String msg="For "+obj+".slice("+start+", "+end+")";try{invoke(obj,Object.class, 
"slice",args);fail(msg+" should throw exception but does not.");}catch(Exception
e){out("Correctness: "+msg+" correctly throws exception.");}}}