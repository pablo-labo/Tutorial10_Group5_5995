package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import defpackage.ey8;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes2.dex */
public final class svf {
    public static final wvf A;
    public static final u B;
    public static final tvf a = new tvf(Class.class, new ovf(new k()));
    public static final tvf b = new tvf(BitSet.class, new ovf(new v()));
    public static final x c;
    public static final uvf d;
    public static final uvf e;
    public static final uvf f;
    public static final uvf g;
    public static final tvf h;
    public static final tvf i;
    public static final tvf j;
    public static final b k;
    public static final uvf l;
    public static final g m;
    public static final h n;
    public static final i o;
    public static final tvf p;
    public static final tvf q;
    public static final tvf r;
    public static final tvf s;
    public static final tvf t;
    public static final wvf u;
    public static final tvf v;
    public static final tvf w;
    public static final vvf x;
    public static final tvf y;
    public static final t z;

    public class a extends pvf<AtomicIntegerArray> {
        @Override // defpackage.pvf
        public final AtomicIntegerArray a(nb8 nb8Var) throws IOException {
            ArrayList arrayList = new ArrayList();
            nb8Var.a();
            while (nb8Var.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(nb8Var.nextInt()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
            nb8Var.v();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, AtomicIntegerArray atomicIntegerArray) throws IOException {
            gc8Var.h();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                gc8Var.f0(r5.get(i));
            }
            gc8Var.v();
        }
    }

    public class a0 extends pvf<Number> {
        @Override // defpackage.pvf
        public final Number a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            try {
                return Integer.valueOf(nb8Var.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Number number) throws IOException {
            if (number == null) {
                gc8Var.Q();
            } else {
                gc8Var.f0(r4.intValue());
            }
        }
    }

    public class b extends pvf<Number> {
        @Override // defpackage.pvf
        public final Number a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            try {
                return Long.valueOf(nb8Var.nextLong());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                gc8Var.Q();
            } else {
                gc8Var.f0(number2.longValue());
            }
        }
    }

    public class b0 extends pvf<AtomicInteger> {
        @Override // defpackage.pvf
        public final AtomicInteger a(nb8 nb8Var) {
            try {
                return new AtomicInteger(nb8Var.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, AtomicInteger atomicInteger) throws IOException {
            gc8Var.f0(atomicInteger.get());
        }
    }

    public class c extends pvf<Number> {
        @Override // defpackage.pvf
        public final Number a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() != sb8.X) {
                return Float.valueOf((float) nb8Var.nextDouble());
            }
            nb8Var.l1();
            return null;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Number number) throws IOException {
            Number numberValueOf = number;
            if (numberValueOf == null) {
                gc8Var.Q();
                return;
            }
            if (!(numberValueOf instanceof Float)) {
                numberValueOf = Float.valueOf(numberValueOf.floatValue());
            }
            gc8Var.h0(numberValueOf);
        }
    }

    public class c0 extends pvf<AtomicBoolean> {
        @Override // defpackage.pvf
        public final AtomicBoolean a(nb8 nb8Var) {
            return new AtomicBoolean(nb8Var.nextBoolean());
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, AtomicBoolean atomicBoolean) throws IOException {
            gc8Var.k0(atomicBoolean.get());
        }
    }

    public class d extends pvf<Number> {
        @Override // defpackage.pvf
        public final Number a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() != sb8.X) {
                return Double.valueOf(nb8Var.nextDouble());
            }
            nb8Var.l1();
            return null;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                gc8Var.Q();
            } else {
                gc8Var.d0(number2.doubleValue());
            }
        }
    }

    public static final class d0<T extends Enum<T>> extends pvf<T> {
        public final HashMap a = new HashMap();
        public final HashMap b = new HashMap();
        public final HashMap c = new HashMap();

        public class a implements PrivilegedAction<Field[]> {
            public final /* synthetic */ Class a;

            public a(Class cls) {
                this.a = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public d0(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r5 = (Enum) field.get(null);
                    String strName = r5.name();
                    String string = r5.toString();
                    b8e b8eVar = (b8e) field.getAnnotation(b8e.class);
                    if (b8eVar != null) {
                        strName = b8eVar.value();
                        for (String str : b8eVar.alternate()) {
                            this.a.put(str, r5);
                        }
                    }
                    this.a.put(strName, r5);
                    this.b.put(string, r5);
                    this.c.put(r5, strName);
                }
            } catch (IllegalAccessException e) {
                g7.l(e);
                throw null;
            }
        }

        @Override // defpackage.pvf
        public final Object a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            String strI0 = nb8Var.I0();
            Enum r0 = (Enum) this.a.get(strI0);
            return r0 == null ? (Enum) this.b.get(strI0) : r0;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Object obj) throws IOException {
            Enum r2 = (Enum) obj;
            gc8Var.j0(r2 == null ? null : (String) this.c.get(r2));
        }
    }

    public class e extends pvf<Character> {
        @Override // defpackage.pvf
        public final Character a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            String strI0 = nb8Var.I0();
            if (strI0.length() == 1) {
                return Character.valueOf(strI0.charAt(0));
            }
            StringBuilder sbM = akb.m("Expecting character, got: ", strI0, "; at ");
            sbM.append(nb8Var.Q());
            throw new JsonSyntaxException(sbM.toString());
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Character ch) throws IOException {
            Character ch2 = ch;
            gc8Var.j0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    public class f extends pvf<String> {
        @Override // defpackage.pvf
        public final String a(nb8 nb8Var) throws IOException {
            sb8 sb8VarJ0 = nb8Var.j0();
            if (sb8VarJ0 != sb8.X) {
                return sb8VarJ0 == sb8.W ? Boolean.toString(nb8Var.nextBoolean()) : nb8Var.I0();
            }
            nb8Var.l1();
            return null;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, String str) throws IOException {
            gc8Var.j0(str);
        }
    }

    public class g extends pvf<BigDecimal> {
        @Override // defpackage.pvf
        public final BigDecimal a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            String strI0 = nb8Var.I0();
            try {
                return new BigDecimal(strI0);
            } catch (NumberFormatException e) {
                ja.n(akb.m("Failed parsing '", strI0, "' as BigDecimal; at path "), nb8Var.Q(), e);
                return null;
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, BigDecimal bigDecimal) throws IOException {
            gc8Var.h0(bigDecimal);
        }
    }

    public class h extends pvf<BigInteger> {
        @Override // defpackage.pvf
        public final BigInteger a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            String strI0 = nb8Var.I0();
            try {
                return new BigInteger(strI0);
            } catch (NumberFormatException e) {
                ja.n(akb.m("Failed parsing '", strI0, "' as BigInteger; at path "), nb8Var.Q(), e);
                return null;
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, BigInteger bigInteger) throws IOException {
            gc8Var.h0(bigInteger);
        }
    }

    public class i extends pvf<bn8> {
        @Override // defpackage.pvf
        public final bn8 a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() != sb8.X) {
                return new bn8(nb8Var.I0());
            }
            nb8Var.l1();
            return null;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, bn8 bn8Var) throws IOException {
            gc8Var.h0(bn8Var);
        }
    }

    public class j extends pvf<StringBuilder> {
        @Override // defpackage.pvf
        public final StringBuilder a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() != sb8.X) {
                return new StringBuilder(nb8Var.I0());
            }
            nb8Var.l1();
            return null;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, StringBuilder sb) throws IOException {
            StringBuilder sb2 = sb;
            gc8Var.j0(sb2 == null ? null : sb2.toString());
        }
    }

    public class k extends pvf<Class> {
        @Override // defpackage.pvf
        public final Class a(nb8 nb8Var) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Class cls) {
            throw new UnsupportedOperationException(o6.e(cls, new StringBuilder("Attempted to serialize java.lang.Class: "), ". Forgot to register a type adapter?"));
        }
    }

    public class l extends pvf<StringBuffer> {
        @Override // defpackage.pvf
        public final StringBuffer a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() != sb8.X) {
                return new StringBuffer(nb8Var.I0());
            }
            nb8Var.l1();
            return null;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, StringBuffer stringBuffer) throws IOException {
            StringBuffer stringBuffer2 = stringBuffer;
            gc8Var.j0(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    public class m extends pvf<URL> {
        @Override // defpackage.pvf
        public final URL a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            String strI0 = nb8Var.I0();
            if ("null".equals(strI0)) {
                return null;
            }
            return new URL(strI0);
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, URL url) throws IOException {
            URL url2 = url;
            gc8Var.j0(url2 == null ? null : url2.toExternalForm());
        }
    }

    public class n extends pvf<URI> {
        @Override // defpackage.pvf
        public final URI a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            try {
                String strI0 = nb8Var.I0();
                if ("null".equals(strI0)) {
                    return null;
                }
                return new URI(strI0);
            } catch (URISyntaxException e) {
                throw new JsonIOException(e);
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, URI uri) throws IOException {
            URI uri2 = uri;
            gc8Var.j0(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    public class o extends pvf<InetAddress> {
        @Override // defpackage.pvf
        public final InetAddress a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() != sb8.X) {
                return InetAddress.getByName(nb8Var.I0());
            }
            nb8Var.l1();
            return null;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, InetAddress inetAddress) throws IOException {
            InetAddress inetAddress2 = inetAddress;
            gc8Var.j0(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    public class p extends pvf<UUID> {
        @Override // defpackage.pvf
        public final UUID a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            String strI0 = nb8Var.I0();
            try {
                return UUID.fromString(strI0);
            } catch (IllegalArgumentException e) {
                ja.n(akb.m("Failed parsing '", strI0, "' as UUID; at path "), nb8Var.Q(), e);
                return null;
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, UUID uuid) throws IOException {
            UUID uuid2 = uuid;
            gc8Var.j0(uuid2 == null ? null : uuid2.toString());
        }
    }

    public class q extends pvf<Currency> {
        @Override // defpackage.pvf
        public final Currency a(nb8 nb8Var) throws IOException {
            String strI0 = nb8Var.I0();
            try {
                return Currency.getInstance(strI0);
            } catch (IllegalArgumentException e) {
                ja.n(akb.m("Failed parsing '", strI0, "' as Currency; at path "), nb8Var.Q(), e);
                return null;
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Currency currency) throws IOException {
            gc8Var.j0(currency.getCurrencyCode());
        }
    }

    public class r extends pvf<Calendar> {
        @Override // defpackage.pvf
        public final Calendar a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            nb8Var.h();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (nb8Var.j0() != sb8.d) {
                String strX = nb8Var.X();
                int iNextInt = nb8Var.nextInt();
                if ("year".equals(strX)) {
                    i = iNextInt;
                } else if ("month".equals(strX)) {
                    i2 = iNextInt;
                } else if ("dayOfMonth".equals(strX)) {
                    i3 = iNextInt;
                } else if ("hourOfDay".equals(strX)) {
                    i4 = iNextInt;
                } else if ("minute".equals(strX)) {
                    i5 = iNextInt;
                } else if ("second".equals(strX)) {
                    i6 = iNextInt;
                }
            }
            nb8Var.G();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Calendar calendar) throws IOException {
            if (calendar == null) {
                gc8Var.Q();
                return;
            }
            gc8Var.p();
            gc8Var.N("year");
            gc8Var.f0(r4.get(1));
            gc8Var.N("month");
            gc8Var.f0(r4.get(2));
            gc8Var.N("dayOfMonth");
            gc8Var.f0(r4.get(5));
            gc8Var.N("hourOfDay");
            gc8Var.f0(r4.get(11));
            gc8Var.N("minute");
            gc8Var.f0(r4.get(12));
            gc8Var.N("second");
            gc8Var.f0(r4.get(13));
            gc8Var.G();
        }
    }

    public class s extends pvf<Locale> {
        @Override // defpackage.pvf
        public final Locale a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(nb8Var.I0(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Locale locale) throws IOException {
            Locale locale2 = locale;
            gc8Var.j0(locale2 == null ? null : locale2.toString());
        }
    }

    public class t extends pvf<ka8> {
        public static ka8 c(nb8 nb8Var, sb8 sb8Var) throws IOException {
            int iOrdinal = sb8Var.ordinal();
            if (iOrdinal == 5) {
                return new fb8(nb8Var.I0());
            }
            if (iOrdinal == 6) {
                return new fb8(new bn8(nb8Var.I0()));
            }
            if (iOrdinal == 7) {
                return new fb8(Boolean.valueOf(nb8Var.nextBoolean()));
            }
            if (iOrdinal == 8) {
                nb8Var.l1();
                return xa8.a;
            }
            bg.n(sb8Var, "Unexpected token: ");
            return null;
        }

        public static void d(ka8 ka8Var, gc8 gc8Var) throws IOException {
            if (ka8Var == null || (ka8Var instanceof xa8)) {
                gc8Var.Q();
                return;
            }
            if (ka8Var instanceof fb8) {
                fb8 fb8Var = (fb8) ka8Var;
                Serializable serializable = fb8Var.a;
                if (serializable instanceof Number) {
                    gc8Var.h0(fb8Var.f());
                    return;
                } else if (serializable instanceof Boolean) {
                    gc8Var.k0(fb8Var.a());
                    return;
                } else {
                    gc8Var.j0(fb8Var.g());
                    return;
                }
            }
            if (ka8Var instanceof w98) {
                gc8Var.h();
                Iterator<ka8> it = ka8Var.c().a.iterator();
                while (it.hasNext()) {
                    d(it.next(), gc8Var);
                }
                gc8Var.v();
                return;
            }
            if (!(ka8Var instanceof ab8)) {
                bg.m(ka8Var.getClass(), "Couldn't write ");
                return;
            }
            gc8Var.p();
            Iterator it2 = ((ey8.b) ka8Var.d().a.entrySet()).iterator();
            while (((ey8.d) it2).hasNext()) {
                Map.Entry entryA = ((ey8.b.a) it2).a();
                gc8Var.N((String) entryA.getKey());
                d((ka8) entryA.getValue(), gc8Var);
            }
            gc8Var.G();
        }

        @Override // defpackage.pvf
        public final ka8 a(nb8 nb8Var) throws IOException {
            ka8 w98Var;
            ka8 w98Var2;
            if (nb8Var instanceof cc8) {
                cc8 cc8Var = (cc8) nb8Var;
                sb8 sb8VarJ0 = cc8Var.j0();
                if (sb8VarJ0 == sb8.e || sb8VarJ0 == sb8.b || sb8VarJ0 == sb8.d || sb8VarJ0 == sb8.Y) {
                    n6.d("Unexpected ", sb8VarJ0, " when reading a JsonElement.");
                    return null;
                }
                ka8 ka8Var = (ka8) cc8Var.K0();
                cc8Var.I();
                return ka8Var;
            }
            sb8 sb8VarJ02 = nb8Var.j0();
            int iOrdinal = sb8VarJ02.ordinal();
            if (iOrdinal == 0) {
                nb8Var.a();
                w98Var = new w98();
            } else if (iOrdinal != 2) {
                w98Var = null;
            } else {
                nb8Var.h();
                w98Var = new ab8();
            }
            if (w98Var == null) {
                return c(nb8Var, sb8VarJ02);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (nb8Var.hasNext()) {
                    String strX = w98Var instanceof ab8 ? nb8Var.X() : null;
                    sb8 sb8VarJ03 = nb8Var.j0();
                    int iOrdinal2 = sb8VarJ03.ordinal();
                    if (iOrdinal2 == 0) {
                        nb8Var.a();
                        w98Var2 = new w98();
                    } else if (iOrdinal2 != 2) {
                        w98Var2 = null;
                    } else {
                        nb8Var.h();
                        w98Var2 = new ab8();
                    }
                    boolean z = w98Var2 != null;
                    if (w98Var2 == null) {
                        w98Var2 = c(nb8Var, sb8VarJ03);
                    }
                    if (w98Var instanceof w98) {
                        ((w98) w98Var).i(w98Var2);
                    } else {
                        ((ab8) w98Var).i(strX, w98Var2);
                    }
                    if (z) {
                        arrayDeque.addLast(w98Var);
                        w98Var = w98Var2;
                    }
                } else {
                    if (w98Var instanceof w98) {
                        nb8Var.v();
                    } else {
                        nb8Var.G();
                    }
                    if (arrayDeque.isEmpty()) {
                        return w98Var;
                    }
                    w98Var = (ka8) arrayDeque.removeLast();
                }
            }
        }

        @Override // defpackage.pvf
        public final /* bridge */ /* synthetic */ void b(gc8 gc8Var, ka8 ka8Var) throws IOException {
            d(ka8Var, gc8Var);
        }
    }

    public class u implements qvf {
        @Override // defpackage.qvf
        public final <T> pvf<T> c(ae6 ae6Var, iyf<T> iyfVar) {
            Class<? super T> superclass = iyfVar.a;
            if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                return null;
            }
            if (!superclass.isEnum()) {
                superclass = superclass.getSuperclass();
            }
            return new d0(superclass);
        }
    }

    public class v extends pvf<BitSet> {
        @Override // defpackage.pvf
        public final BitSet a(nb8 nb8Var) throws IOException {
            boolean zNextBoolean;
            BitSet bitSet = new BitSet();
            nb8Var.a();
            sb8 sb8VarJ0 = nb8Var.j0();
            int i = 0;
            while (sb8VarJ0 != sb8.b) {
                int iOrdinal = sb8VarJ0.ordinal();
                if (iOrdinal == 5 || iOrdinal == 6) {
                    int iNextInt = nb8Var.nextInt();
                    if (iNextInt == 0) {
                        zNextBoolean = false;
                    } else {
                        if (iNextInt != 1) {
                            StringBuilder sbG = o6.g(iNextInt, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            sbG.append(nb8Var.Q());
                            throw new JsonSyntaxException(sbG.toString());
                        }
                        zNextBoolean = true;
                    }
                } else {
                    if (iOrdinal != 7) {
                        StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
                        sb.append(sb8VarJ0);
                        String strC = nb8Var.c();
                        sb.append("; at path ");
                        sb.append(strC);
                        throw new JsonSyntaxException(sb.toString());
                    }
                    zNextBoolean = nb8Var.nextBoolean();
                }
                if (zNextBoolean) {
                    bitSet.set(i);
                }
                i++;
                sb8VarJ0 = nb8Var.j0();
            }
            nb8Var.v();
            return bitSet;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            gc8Var.h();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                gc8Var.f0(bitSet2.get(i) ? 1L : 0L);
            }
            gc8Var.v();
        }
    }

    public class w extends pvf<Boolean> {
        @Override // defpackage.pvf
        public final Boolean a(nb8 nb8Var) throws IOException {
            sb8 sb8VarJ0 = nb8Var.j0();
            if (sb8VarJ0 != sb8.X) {
                return sb8VarJ0 == sb8.f ? Boolean.valueOf(Boolean.parseBoolean(nb8Var.I0())) : Boolean.valueOf(nb8Var.nextBoolean());
            }
            nb8Var.l1();
            return null;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Boolean bool) throws IOException {
            Boolean bool2 = bool;
            if (bool2 == null) {
                gc8Var.Q();
                return;
            }
            gc8Var.m0();
            gc8Var.a();
            gc8Var.a.write(bool2.booleanValue() ? "true" : "false");
        }
    }

    public class x extends pvf<Boolean> {
        @Override // defpackage.pvf
        public final Boolean a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() != sb8.X) {
                return Boolean.valueOf(nb8Var.I0());
            }
            nb8Var.l1();
            return null;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Boolean bool) throws IOException {
            Boolean bool2 = bool;
            gc8Var.j0(bool2 == null ? "null" : bool2.toString());
        }
    }

    public class y extends pvf<Number> {
        @Override // defpackage.pvf
        public final Number a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            try {
                int iNextInt = nb8Var.nextInt();
                if (iNextInt <= 255 && iNextInt >= -128) {
                    return Byte.valueOf((byte) iNextInt);
                }
                StringBuilder sbG = o6.g(iNextInt, "Lossy conversion from ", " to byte; at path ");
                sbG.append(nb8Var.Q());
                throw new JsonSyntaxException(sbG.toString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Number number) throws IOException {
            if (number == null) {
                gc8Var.Q();
            } else {
                gc8Var.f0(r4.byteValue());
            }
        }
    }

    public class z extends pvf<Number> {
        @Override // defpackage.pvf
        public final Number a(nb8 nb8Var) throws IOException {
            if (nb8Var.j0() == sb8.X) {
                nb8Var.l1();
                return null;
            }
            try {
                int iNextInt = nb8Var.nextInt();
                if (iNextInt <= 65535 && iNextInt >= -32768) {
                    return Short.valueOf((short) iNextInt);
                }
                StringBuilder sbG = o6.g(iNextInt, "Lossy conversion from ", " to short; at path ");
                sbG.append(nb8Var.Q());
                throw new JsonSyntaxException(sbG.toString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, Number number) throws IOException {
            if (number == null) {
                gc8Var.Q();
            } else {
                gc8Var.f0(r4.shortValue());
            }
        }
    }

    static {
        w wVar = new w();
        c = new x();
        d = new uvf(Boolean.TYPE, Boolean.class, wVar);
        e = new uvf(Byte.TYPE, Byte.class, new y());
        f = new uvf(Short.TYPE, Short.class, new z());
        g = new uvf(Integer.TYPE, Integer.class, new a0());
        h = new tvf(AtomicInteger.class, new ovf(new b0()));
        i = new tvf(AtomicBoolean.class, new ovf(new c0()));
        j = new tvf(AtomicIntegerArray.class, new ovf(new a()));
        k = new b();
        new c();
        new d();
        l = new uvf(Character.TYPE, Character.class, new e());
        f fVar = new f();
        m = new g();
        n = new h();
        o = new i();
        p = new tvf(String.class, fVar);
        q = new tvf(StringBuilder.class, new j());
        r = new tvf(StringBuffer.class, new l());
        s = new tvf(URL.class, new m());
        t = new tvf(URI.class, new n());
        u = new wvf(InetAddress.class, new o());
        v = new tvf(UUID.class, new p());
        w = new tvf(Currency.class, new ovf(new q()));
        x = new vvf(new r());
        y = new tvf(Locale.class, new s());
        t tVar = new t();
        z = tVar;
        A = new wvf(ka8.class, tVar);
        B = new u();
    }
}
