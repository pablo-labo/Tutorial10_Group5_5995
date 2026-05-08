package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public final EnumC0161a a;
    public final SVGLength[] b;
    public ReadableArray c;
    public final boolean d;
    public boolean e;
    public Matrix f;
    public Rect g;
    public o h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.horcrux.svg.a$a, reason: collision with other inner class name */
    public static final class EnumC0161a {
        public static final EnumC0161a a;
        public static final EnumC0161a b;
        public static final EnumC0161a c;
        public static final /* synthetic */ EnumC0161a[] d;

        static {
            EnumC0161a enumC0161a = new EnumC0161a("LINEAR_GRADIENT", 0);
            a = enumC0161a;
            EnumC0161a enumC0161a2 = new EnumC0161a("RADIAL_GRADIENT", 1);
            b = enumC0161a2;
            EnumC0161a enumC0161a3 = new EnumC0161a("PATTERN", 2);
            c = enumC0161a3;
            d = new EnumC0161a[]{enumC0161a, enumC0161a2, enumC0161a3};
        }

        public EnumC0161a() {
            throw null;
        }

        public static EnumC0161a valueOf(String str) {
            return (EnumC0161a) Enum.valueOf(EnumC0161a.class, str);
        }

        public static EnumC0161a[] values() {
            return (EnumC0161a[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("OBJECT_BOUNDING_BOX", 0);
            a = bVar;
            b bVar2 = new b("USER_SPACE_ON_USE", 1);
            b = bVar2;
            c = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public a(EnumC0161a enumC0161a, SVGLength[] sVGLengthArr, b bVar) {
        this.a = enumC0161a;
        this.b = sVGLengthArr;
        this.d = bVar == b.a;
    }

    public final double a(SVGLength sVGLength, double d, float f, float f2) {
        return p.a(sVGLength, d, (this.d && sVGLength.b == SVGLength.UnitType.NUMBER) ? d : f, f2);
    }
}
