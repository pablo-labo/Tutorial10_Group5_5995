package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import defpackage.arg;
import defpackage.koc;
import defpackage.s40;
import defpackage.snc;
import defpackage.tnc;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class e {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static class a extends l {
        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    public static class b extends l {
        public final boolean i;

        public b(snc sncVar, Method method, boolean z) {
            super(sncVar, "boolean", method);
            this.i = z;
        }

        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            return obj == null ? this.i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public static class c extends l {
        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    public static class d extends l {
        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            if (obj != null) {
                return ColorPropConverter.getColor(obj, context);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.e$e, reason: collision with other inner class name */
    public static class C0138e extends l {
        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            if (obj != null) {
                return obj instanceof Double ? Integer.valueOf(((Double) obj).intValue()) : (Integer) obj;
            }
            return null;
        }
    }

    public static class h extends l {
        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }
    }

    public static class k extends l {
        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    public static class m extends l {
        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            return (String) obj;
        }
    }

    public static l a(snc sncVar, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new h(sncVar, "mixed", method);
        }
        if (cls == Boolean.TYPE) {
            return new b(sncVar, method, sncVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            return "Color".equals(sncVar.customType()) ? new f(sncVar, method, sncVar.defaultInt()) : new j(sncVar, method, sncVar.defaultInt());
        }
        if (cls == Float.TYPE) {
            return new i(sncVar, method, sncVar.defaultFloat());
        }
        if (cls == Double.TYPE) {
            return new g(sncVar, method, sncVar.defaultDouble());
        }
        if (cls == String.class) {
            return new m(sncVar, "String", method);
        }
        if (cls == Boolean.class) {
            return new c(sncVar, "boolean", method);
        }
        if (cls == Integer.class) {
            return "Color".equals(sncVar.customType()) ? new d(sncVar, "mixed", method) : new C0138e(sncVar, "number", method);
        }
        if (cls == ReadableArray.class) {
            return new a(sncVar, "Array", method);
        }
        if (cls == ReadableMap.class) {
            return new k(sncVar, "Map", method);
        }
        StringBuilder sb = new StringBuilder("Unrecognized type: ");
        sb.append(cls);
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        sb.append(" for method: ");
        sb.append(name);
        sb.append("#");
        sb.append(name2);
        throw new RuntimeException(sb.toString());
    }

    public static void b(tnc tncVar, Method method, Class cls, HashMap map) {
        String[] strArrNames = tncVar.names();
        int i2 = 0;
        if (cls == Dynamic.class) {
            while (i2 < strArrNames.length) {
                map.put(strArrNames[i2], new h(tncVar, "mixed", method, i2));
                i2++;
            }
            return;
        }
        if (cls == Integer.TYPE) {
            while (i2 < strArrNames.length) {
                if ("Color".equals(tncVar.customType())) {
                    map.put(strArrNames[i2], new f(tncVar, method, i2, tncVar.defaultInt()));
                } else {
                    map.put(strArrNames[i2], new j(tncVar, method, i2, tncVar.defaultInt()));
                }
                i2++;
            }
            return;
        }
        if (cls == Float.TYPE) {
            while (i2 < strArrNames.length) {
                map.put(strArrNames[i2], new i(tncVar, method, i2, tncVar.defaultFloat()));
                i2++;
            }
            return;
        }
        if (cls == Double.TYPE) {
            for (int i3 = 0; i3 < strArrNames.length; i3++) {
                map.put(strArrNames[i3], new g(tncVar, method, i3, tncVar.defaultDouble()));
            }
            return;
        }
        if (cls == Integer.class) {
            while (i2 < strArrNames.length) {
                if ("Color".equals(tncVar.customType())) {
                    map.put(strArrNames[i2], new d(tncVar, "mixed", method, i2));
                } else {
                    map.put(strArrNames[i2], new C0138e(tncVar, "number", method, i2));
                }
                i2++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Unrecognized type: ");
        sb.append(cls);
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        sb.append(" for method: ");
        sb.append(name);
        sb.append("#");
        sb.append(name2);
        throw new RuntimeException(sb.toString());
    }

    public static Map<String, l> c(Class<? extends koc> cls) {
        if (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (cls2 != koc.class) {
                }
            }
            HashMap map = a;
            Map<String, l> map2 = (Map) map.get(cls);
            if (map2 != null) {
                return map2;
            }
            HashMap map3 = new HashMap(c(cls.getSuperclass()));
            for (Method method : cls.getDeclaredMethods()) {
                snc sncVar = (snc) method.getAnnotation(snc.class);
                if (sncVar != null) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length != 1) {
                        s40.j("Wrong number of args for prop setter: ", cls.getName(), method.getName());
                        return null;
                    }
                    map3.put(sncVar.name(), a(sncVar, method, parameterTypes[0]));
                }
                tnc tncVar = (tnc) method.getAnnotation(tnc.class);
                if (tncVar != null) {
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes2.length != 2) {
                        s40.j("Wrong number of args for group prop setter: ", cls.getName(), method.getName());
                        return null;
                    }
                    if (parameterTypes2[0] != Integer.TYPE) {
                        s40.j("Second argument should be property index: ", cls.getName(), method.getName());
                        return null;
                    }
                    b(tncVar, method, parameterTypes2[1], map3);
                }
            }
            map.put(cls, map3);
            return map3;
        }
        return b;
    }

    public static Map<String, l> d(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return b;
        }
        HashMap map = a;
        Map<String, l> map2 = (Map) map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap map3 = new HashMap(d(cls.getSuperclass()));
        for (Method method : cls.getDeclaredMethods()) {
            snc sncVar = (snc) method.getAnnotation(snc.class);
            if (sncVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    s40.j("Wrong number of args for prop setter: ", cls.getName(), method.getName());
                    return null;
                }
                if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    s40.j("First param should be a view subclass to be updated: ", cls.getName(), method.getName());
                    return null;
                }
                map3.put(sncVar.name(), a(sncVar, method, parameterTypes[1]));
            }
            tnc tncVar = (tnc) method.getAnnotation(tnc.class);
            if (tncVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    s40.j("Wrong number of args for group prop setter: ", cls.getName(), method.getName());
                    return null;
                }
                if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    s40.j("First param should be a view subclass to be updated: ", cls.getName(), method.getName());
                    return null;
                }
                if (parameterTypes2[1] != Integer.TYPE) {
                    s40.j("Second argument should be property index: ", cls.getName(), method.getName());
                    return null;
                }
                b(tncVar, method, parameterTypes2[2], map3);
            }
        }
        map.put(cls, map3);
        return map3;
    }

    public static class f extends l {
        public final int i;

        public f(snc sncVar, Method method, int i) {
            super(sncVar, "mixed", method);
            this.i = i;
        }

        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            return obj == null ? Integer.valueOf(this.i) : ColorPropConverter.getColor(obj, context);
        }

        public f(tnc tncVar, Method method, int i, int i2) {
            super(tncVar, "mixed", method, i);
            this.i = i2;
        }
    }

    public static class g extends l {
        public final double i;

        public g(snc sncVar, Method method, double d) {
            super(sncVar, "number", method);
            this.i = d;
        }

        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.i : ((Double) obj).doubleValue());
        }

        public g(tnc tncVar, Method method, int i, double d) {
            super(tncVar, "number", method, i);
            this.i = d;
        }
    }

    public static class i extends l {
        public final float i;

        public i(snc sncVar, Method method, float f) {
            super(sncVar, "number", method);
            this.i = f;
        }

        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.i : ((Double) obj).floatValue());
        }

        public i(tnc tncVar, Method method, int i, float f) {
            super(tncVar, "number", method, i);
            this.i = f;
        }
    }

    public static class j extends l {
        public final int i;

        public j(snc sncVar, Method method, int i) {
            super(sncVar, "number", method);
            this.i = i;
        }

        @Override // com.facebook.react.uimanager.e.l
        public final Object a(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.i : ((Double) obj).intValue());
        }

        public j(tnc tncVar, Method method, int i, int i2) {
            super(tncVar, "number", method, i);
            this.i = i2;
        }
    }

    public static abstract class l {
        public static final arg e;
        public static final arg f;
        public static final arg g;
        public static final arg h;
        public final String a;
        public final String b;
        public final Method c;
        public final Integer d;

        static {
            HashMap map = e.a;
            e = new arg(2);
            f = new arg(3);
            g = new arg(1);
            h = new arg(2);
        }

        public l(tnc tncVar, String str, Method method, int i) {
            this.a = tncVar.names()[i];
            this.b = "__default_type__".equals(tncVar.customType()) ? str : tncVar.customType();
            this.c = method;
            this.d = Integer.valueOf(i);
        }

        public abstract Object a(Object obj, Context context);

        public l(snc sncVar, String str, Method method) {
            this.a = sncVar.name();
            this.b = "__default_type__".equals(sncVar.customType()) ? str : sncVar.customType();
            this.c = method;
            this.d = null;
        }
    }
}
