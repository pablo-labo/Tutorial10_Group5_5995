package defpackage;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class l1a implements m37 {
    public final m37 a;
    public final Integer b;

    public l1a(m37 m37Var, Integer num) {
        this.a = m37Var;
        this.b = num;
    }

    public final l37 a(z07 z07Var, boolean z) {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Object objNewInstance = NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(2048, Boolean.FALSE, Boolean.TRUE);
            objNewInstance.getClass();
            return ((m37) objNewInstance).createImageTranscoder(z07Var, z);
        } catch (ClassNotFoundException e) {
            l6.p("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
            return null;
        } catch (IllegalAccessException e2) {
            l6.p("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            l6.p("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e3);
            return null;
        } catch (InstantiationException e4) {
            l6.p("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            l6.p("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
            return null;
        } catch (SecurityException e6) {
            l6.p("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e6);
            return null;
        } catch (InvocationTargetException e7) {
            l6.p("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
            return null;
        }
    }

    @Override // defpackage.m37
    public final l37 createImageTranscoder(z07 z07Var, boolean z) {
        z07Var.getClass();
        l37 wfeVar = null;
        m37 m37Var = this.a;
        l37 l37VarCreateImageTranscoder = m37Var != null ? m37Var.createImageTranscoder(z07Var, z) : null;
        if (l37VarCreateImageTranscoder == null) {
            Integer num = this.b;
            if (num != null) {
                if (num.intValue() == 0) {
                    wfeVar = a(z07Var, z);
                } else {
                    if (num.intValue() != 1) {
                        l5.q("Invalid ImageTranscoderType");
                        return null;
                    }
                    wfeVar = new wfe(z);
                }
            }
            l37VarCreateImageTranscoder = wfeVar;
        }
        if (l37VarCreateImageTranscoder == null) {
            l37VarCreateImageTranscoder = a(z07Var, z);
        }
        return l37VarCreateImageTranscoder == null ? new wfe(z) : l37VarCreateImageTranscoder;
    }
}
