package checkresults.junit;import static checkresults.ReflectionSupport.create;
import static checkresults.ReflectionSupport.invoke;import static org.junit.
Assert.assertEquals;import org.junit.BeforeClass;import org.junit
.FixMethodOrder;import org.junit.runners.MethodSorters;import checkresults
.AbstractClassDefinitionTest;@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IceCreamConeTest extends AbstractClassDefinitionTest{public final 
static String hwKey="H01-B";private final Object[]noArgs={};@BeforeClass
public static void initializeTests()throws Exception {className=
"occ.cs272.h01.IceCreamCone";init();} public IceCreamConeTest(){getTests(
getClass());methodData=new String[][]{{"double","getSurfaceArea"},{"double",
"getVolume"},};constructorData=new String[][]{{"double","double"},};}public 
void _test_1(){obj=create(thisClass,5.0,1.0);assertEquals("For height->5," + 
" radius->1.0. getVolume->",5.235987755982989,invoke(obj,double.class,
"getVolume",noArgs),tolerance);out("Correctness: getVolume works correctly.");}
public void _test_2(){obj=create(thisClass,5.0,1.0);assertEquals(
"For height->5, radius->1.0. getVolume->",16.01904224441409,invoke(obj,
double.class,"getSurfaceArea",noArgs),tolerance);out("Correctness: getSurf"+
"aceArea works correctly.");}public void _test_3(){double r=Double.parseDouble(
String.format("%.2f",gen.nextDouble()+.5));double h=Double.parseDouble(String
.format("%.2f",gen.nextDouble()*5+2));obj=create(thisClass,h,r);assertEquals(
String.format("For height->%.2f, radius->%.2f. getVolume->",h,r),_aimpl(h,r),
invoke(obj,double.class,"getSurfaceArea",noArgs),tolerance);out("Correctness:"+
" getSurfaceArea works correctly.");}private double qnk(double n){return Math.
sqrt(n);}private double wonk(){return Math.PI;}public void _test_4(){double 
r=Double.parseDouble(String.format("%.2f",gen.nextDouble()+.5));double h=Double
.parseDouble(String.format("%.2f",gen.nextDouble()*5+2));obj=create(thisClass,
h,r);assertEquals(String.format("For height->%.2f, radius->%.2f. getVolume->"
,h,r),_vimpl(h,r),invoke(obj,double.class,"getVolume",noArgs),tolerance);
out("Correctness: getVolume works correctly.");}public void _test_5(){double 
r=Double.parseDouble(String.format("%.2f",gen.nextDouble()+.5));double h=Double
.parseDouble(String.format("%.2f",gen.nextDouble()*5+2));obj=create(thisClass,
h,r);assertEquals(String.format("For height->%.2f, radius->%.2f. getVolume->"
,h,r),_aimpl(h,r),invoke(obj,double.class,"getSurfaceArea",noArgs),tolerance);
out("Correctness: getSurfaceArea works correctly.");}public void _test_6(){
double r=Double.parseDouble(String.format("%.2f",gen.nextDouble()+.5));double h
=Double.parseDouble(String.format("%.2f",gen.nextDouble()*5+2));obj=create(
thisClass,h,r);assertEquals(String.format("For height->%.2f, radius->%.2f. get"+
"Volume->",h,r),_vimpl(h,r),invoke(obj,double.class,"getVolume",noArgs),
tolerance);out("Correctness: getVolume works correctly.");}private double 
_vimpl(double h,double r){return wonk()*r*r*h/3;}private double _aimpl(double 
h,double r){return wonk()*r*qnk(r*r+h*h);}}