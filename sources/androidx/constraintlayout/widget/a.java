package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import defpackage.nac;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public boolean a = false;
    public String b;
    public EnumC0026a c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public static final class EnumC0026a {
        public static final EnumC0026a V;
        public static final EnumC0026a W;
        public static final /* synthetic */ EnumC0026a[] X;
        public static final EnumC0026a a;
        public static final EnumC0026a b;
        public static final EnumC0026a c;
        public static final EnumC0026a d;
        public static final EnumC0026a e;
        public static final EnumC0026a f;

        static {
            EnumC0026a enumC0026a = new EnumC0026a("INT_TYPE", 0);
            a = enumC0026a;
            EnumC0026a enumC0026a2 = new EnumC0026a("FLOAT_TYPE", 1);
            b = enumC0026a2;
            EnumC0026a enumC0026a3 = new EnumC0026a("COLOR_TYPE", 2);
            c = enumC0026a3;
            EnumC0026a enumC0026a4 = new EnumC0026a("COLOR_DRAWABLE_TYPE", 3);
            d = enumC0026a4;
            EnumC0026a enumC0026a5 = new EnumC0026a("STRING_TYPE", 4);
            e = enumC0026a5;
            EnumC0026a enumC0026a6 = new EnumC0026a("BOOLEAN_TYPE", 5);
            f = enumC0026a6;
            EnumC0026a enumC0026a7 = new EnumC0026a("DIMENSION_TYPE", 6);
            V = enumC0026a7;
            EnumC0026a enumC0026a8 = new EnumC0026a("REFERENCE_TYPE", 7);
            W = enumC0026a8;
            X = new EnumC0026a[]{enumC0026a, enumC0026a2, enumC0026a3, enumC0026a4, enumC0026a5, enumC0026a6, enumC0026a7, enumC0026a8};
        }

        public EnumC0026a() {
            throw null;
        }

        public static EnumC0026a valueOf(String str) {
            return (EnumC0026a) Enum.valueOf(EnumC0026a.class, str);
        }

        public static EnumC0026a[] values() {
            return (EnumC0026a[]) X.clone();
        }
    }

    public a(a aVar, Object obj) {
        this.b = aVar.b;
        this.c = aVar.c;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), nac.e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        EnumC0026a enumC0026a = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0026a = EnumC0026a.f;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                enumC0026a = EnumC0026a.c;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                enumC0026a = EnumC0026a.d;
            } else {
                EnumC0026a enumC0026a2 = EnumC0026a.V;
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    enumC0026a = EnumC0026a.b;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    enumC0026a = EnumC0026a.a;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    enumC0026a = EnumC0026a.e;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    enumC0026a = EnumC0026a.W;
                }
                enumC0026a = enumC0026a2;
            }
        }
        if (string != null && objValueOf != null) {
            a aVar = new a();
            aVar.b = string;
            aVar.c = enumC0026a;
            aVar.a = z;
            aVar.b(objValueOf);
            map.put(string, aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                break;
            case 1:
                this.e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f = (String) obj;
                break;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }
}
