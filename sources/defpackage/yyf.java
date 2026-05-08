package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import defpackage.ho5;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class yyf extends wyf {
    public final Class<?> f;
    public final Constructor<?> g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public yyf() throws NoSuchMethodException {
        Method methodK;
        Constructor<?> constructor;
        Method methodJ;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodJ = j(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodK = k(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodK = null;
            constructor = null;
            methodJ = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f = cls;
        this.g = constructor;
        this.h = methodJ;
        this.i = method;
        this.j = method2;
        this.k = method3;
        this.l = methodK;
    }

    public static Method j(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // defpackage.bzf
    public final Typeface a(Context context, ho5.b bVar, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        ho5.c[] cVarArr = bVar.a;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            wyf.f();
            try {
                Object objNewInstance2 = wyf.b.newInstance(null);
                for (ho5.c cVar : cVarArr) {
                    File fileB = czf.b(context);
                    if (fileB != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(cVar.f);
                            } catch (Throwable th) {
                                th = th;
                                inputStreamOpenRawResource = null;
                            }
                            try {
                                boolean zA = czf.a(fileB, inputStreamOpenRawResource);
                                if (inputStreamOpenRawResource != null) {
                                    try {
                                        inputStreamOpenRawResource.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                if (!zA) {
                                    fileB.delete();
                                    return null;
                                }
                                if (!wyf.e(objNewInstance2, fileB.getPath(), cVar.b, cVar.c)) {
                                    fileB.delete();
                                    return null;
                                }
                                fileB.delete();
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                if (inputStreamOpenRawResource == null) {
                                    throw th3;
                                }
                                try {
                                    inputStreamOpenRawResource.close();
                                    throw th3;
                                } catch (IOException unused2) {
                                    throw th3;
                                }
                            }
                        } catch (RuntimeException unused3) {
                            fileB.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileB.delete();
                            throw th4;
                        }
                    }
                }
                wyf.f();
                try {
                    Object objNewInstance3 = Array.newInstance(wyf.a, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) wyf.d.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    l5.r(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                l5.r(e2);
                return null;
            }
        }
        try {
            objNewInstance = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = cVarArr.length;
            while (true) {
                if (i2 < length) {
                    ho5.c cVar2 = cVarArr[i2];
                    yyf yyfVar = this;
                    Context context2 = context;
                    if (yyfVar.g(context2, objNewInstance, cVar2.a, cVar2.e, cVar2.b, cVar2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar2.d))) {
                        i2++;
                        this = yyfVar;
                        context = context2;
                    } else {
                        try {
                            yyfVar.k.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    yyf yyfVar2 = this;
                    if (yyfVar2.i(objNewInstance)) {
                        return yyfVar2.h(objNewInstance);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.bzf
    public final Typeface b(Context context, xo5[] xo5VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceH;
        boolean zBooleanValue;
        if (xo5VarArr.length >= 1) {
            Method method = this.h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (xo5 xo5Var : xo5VarArr) {
                        if (xo5Var.e == 0) {
                            Uri uri = xo5Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, czf.c(uri, context));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = xo5VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.k;
                            if (i2 < length) {
                                xo5 xo5Var2 = xo5VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(xo5Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.i.invoke(objNewInstance, byteBuffer, Integer.valueOf(xo5Var2.b), null, Integer.valueOf(xo5Var2.c), Integer.valueOf(xo5Var2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                                z = z;
                            } else if (!z) {
                                method2.invoke(objNewInstance, null);
                            } else if (i(objNewInstance) && (typefaceH = h(objNewInstance)) != null) {
                                return Typeface.create(typefaceH, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? DataOkHttpUploader.HTTP_BAD_REQUEST : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    xo5 xo5Var3 = null;
                    for (xo5 xo5Var4 : xo5VarArr) {
                        int iAbs = (Math.abs(xo5Var4.c - i3) * 2) + (xo5Var4.d == z2 ? 0 : 1);
                        if (xo5Var3 == null || i4 > iAbs) {
                            xo5Var3 = xo5Var4;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(xo5Var3.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(xo5Var3.c).setItalic(xo5Var3.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.bzf
    public final Typeface d(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.g.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!g(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.k.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (i(objNewInstance)) {
                    return h(objNewInstance);
                }
            }
        } else {
            File fileB = czf.b(context);
            try {
                if (fileB != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                    } catch (Throwable th) {
                        th = th;
                        inputStreamOpenRawResource = null;
                    }
                    try {
                        boolean zA = czf.a(fileB, inputStreamOpenRawResource);
                        if (inputStreamOpenRawResource != null) {
                            try {
                                inputStreamOpenRawResource.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (!zA) {
                            fileB.delete();
                            return null;
                        }
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(fileB.getPath());
                        fileB.delete();
                        return typefaceCreateFromFile;
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        if (inputStreamOpenRawResource == null) {
                            throw th3;
                        }
                        try {
                            inputStreamOpenRawResource.close();
                            throw th3;
                        } catch (IOException unused4) {
                            throw th3;
                        }
                    }
                }
            } catch (RuntimeException unused5) {
                fileB.delete();
                return null;
            } catch (Throwable th4) {
                fileB.delete();
                throw th4;
            }
        }
        return null;
    }

    public final boolean g(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface h(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean i(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method k(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
