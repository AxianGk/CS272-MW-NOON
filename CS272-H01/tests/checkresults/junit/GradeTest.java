package checkresults.junit;import static checkresults.ReflectionSupport.create;
import static checkresults.ReflectionSupport.invoke;import static org.junit
.Assert.assertEquals;import org.junit.BeforeClass;import org.junit
.FixMethodOrder;import org.junit.runners.MethodSorters;import checkresults
.AbstractClassDefinitionTest;@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GradeTest extends AbstractClassDefinitionTest{public final static 
String hwKey="H01-C";private final Object[]noArgs={};@BeforeClass public static 
void initializeTests()throws Exception {className="occ.cs272.h01.Grade";init();}
public GradeTest() {getTests(getClass());constructorData=new String[][]{{
"String"},};}public void _test_1(){checkGrade("E",-1);}public void _test_2(){
checkGrade("b",3.0);}public void _test_3(){checkGrade("A-",3.7);}public void 
_test_4(){checkGrade("d+",1.3);}public void _test_5(){checkGrade("f-",-1);}
public void _test_6(){checkGrade("F",0);}public void _test_7(){checkGrade("d-"
,.7);}public void _test_8(){checkGrade("a",4.0);}public void _test_9(){
checkGrade("A",4.0);}public void _test_10(){checkGrade("A+",4.0);}public void 
_test_11(){checkGrade("B+",3.3);}public void _test_12(){checkGrade("B-",2.7);}
public void _test_13(){checkGrade("c+",2.3);}public void _test_14(){
checkGrade("C",2.0);}public void _test_15(){checkGrade("c-",1.7);}public void 
_test_16(){checkGrade("F+",-1);}public void _test_17(){checkGrade("a*",-1);}
public void _test_18(){checkGrade("B++",-1);}private void checkGrade(String 
grade,double pts){String msg="For grade \""+grade+"\", getNumericGrade";obj=
create(thisClass,grade);assertEquals(msg+"->",pts,invoke(obj,double.class,
"getNumericGrade",noArgs),tolerance);out("Correctness: "+msg+
" works correctly.");}}