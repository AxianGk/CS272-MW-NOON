package checkresults.junit;import static checkresults.ReflectionSupport.create;
import static checkresults.ReflectionSupport.invoke;import static org.junit
.Assert.assertEquals;import org.junit.BeforeClass;import org.junit
.FixMethodOrder;import org.junit.runners.MethodSorters;import checkresults
.AbstractClassDefinitionTest;@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoachPopulationTest extends AbstractClassDefinitionTest
{public final static String hwKey="H01-A";private final Object[]noArgs={};
@BeforeClass public static void initializeTests()throws Exception{className=
"occ.cs272.h01.RoachPopulation";init();} public RoachPopulationTest()
{getTests(getClass());methodData=new String[][]{{"void","spray"},{"void",
"breed"},{"int","getRoaches"}};fieldData=new String[][] {{"population","int"},
};constructorData=new String[][]{{"int"},};} public void _test_1(){obj=create(
thisClass,10);assertEquals(10,(int)invoke(obj,int.class,"getRoaches",noArgs));
out("Correctness: constructor initializes population correctly.");}public void 
_test_2(){obj=create(thisClass,10);invoke(obj,"breed",noArgs);invoke(obj,
"spray",noArgs);assertEquals(18,(int)invoke(obj,int.class,"getRoaches",noArgs));
out("Correctness: round #1 simulation correct.");}public void _test_3(){obj=
create(thisClass,10);invoke(obj,"breed",noArgs);invoke(obj,"spray",noArgs);
invoke(obj,"breed",noArgs);invoke(obj,"spray",noArgs);assertEquals(33,(int)invoke(
obj,int.class,"getRoaches",noArgs));out("Correctness: round #2 simulation " + 
"correct.");} public void _test_4() {obj=create(thisClass,10);invoke(obj,
"breed",noArgs);invoke(obj,"spray",noArgs);invoke(obj,"breed",noArgs);invoke(
obj,"spray",noArgs);invoke(obj,"breed",noArgs);invoke(obj,"spray",noArgs);
assertEquals(60,(int)invoke(obj,int.class,"getRoaches",noArgs));out("Correctness:" + 
" round #3 simulation correct.");} public void _test_5(){obj=create(thisClass,
10);invoke(obj,"breed",noArgs);invoke(obj,"spray",noArgs);invoke(obj,"breed",
noArgs);invoke(obj,"spray",noArgs);invoke(obj,"breed",noArgs);invoke(obj,
"spray",noArgs);invoke(obj,"breed",noArgs);invoke(obj,"spray",noArgs);
assertEquals(108,(int)invoke(obj,int.class,"getRoaches",noArgs));out("Correctness:" +
" round #4 simulation correct.");}}