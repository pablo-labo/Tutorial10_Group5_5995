package defpackage;

import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.d;
import com.bumptech.glide.load.engine.e;
import defpackage.fx9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qj3<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends j5d<DataType, ResourceType>> b;
    public final b6d<ResourceType, Transcode> c;
    public final ngb<List<Throwable>> d;
    public final String e;

    public qj3(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends j5d<DataType, ResourceType>> list, b6d<ResourceType, Transcode> b6dVar, ngb<List<Throwable>> ngbVar) {
        this.a = cls;
        this.b = list;
        this.c = b6dVar;
        this.d = ngbVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final f5d a(int i, int i2, ova ovaVar, a aVar, e.a aVar2) {
        f5d f5dVarA;
        prf prfVar;
        ss4 ss4VarC;
        n5d n5dVar;
        f5d f5dVar;
        boolean z;
        boolean z2;
        kg8 xd3Var;
        ngb<List<Throwable>> ngbVar = this.d;
        List<Throwable> listAcquire = ngbVar.acquire();
        beb.e(listAcquire, "Argument must not be null");
        List<Throwable> list = listAcquire;
        try {
            f5d<ResourceType> f5dVarB = b(aVar, i, i2, ovaVar, list);
            ngbVar.a(list);
            e eVar = e.this;
            xe3 xe3Var = aVar2.a;
            d<R> dVar = eVar.a;
            Class<?> cls = f5dVarB.get().getClass();
            if (xe3Var != xe3.d) {
                prf prfVarE = dVar.e((Class<Z>) cls);
                prfVar = prfVarE;
                f5dVarA = prfVarE.a(eVar.W, f5dVarB, eVar.a0, eVar.b0);
            } else {
                f5dVarA = f5dVarB;
                prfVar = null;
            }
            if (!f5dVarB.equals(f5dVarA)) {
                f5dVarB.recycle();
            }
            if (dVar.c.a().d.a(f5dVarA.b()) != null) {
                n5d n5dVarA = dVar.c.a().d.a(f5dVarA.b());
                if (n5dVarA == null) {
                    throw new Registry.NoResultEncoderAvailableException(f5dVarA.b());
                }
                ss4VarC = n5dVarA.c(eVar.d0);
                n5dVar = n5dVarA;
            } else {
                ss4VarC = ss4.c;
                n5dVar = null;
            }
            kg8 kg8Var = eVar.l0;
            ArrayList arrayListB = dVar.b();
            int size = arrayListB.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    f5dVar = null;
                    z = false;
                    break;
                }
                f5dVar = null;
                if (((fx9.a) arrayListB.get(i3)).a.equals(kg8Var)) {
                    z = true;
                    break;
                }
                i3++;
            }
            Object obj = f5dVarA;
            if (eVar.c0.d(!z, xe3Var, ss4VarC)) {
                if (n5dVar == null) {
                    throw new Registry.NoResultEncoderAvailableException(f5dVarA.get().getClass());
                }
                int iOrdinal = ss4VarC.ordinal();
                if (iOrdinal == 0) {
                    z2 = true;
                    xd3Var = new xd3(eVar.l0, eVar.X);
                } else {
                    if (iOrdinal != 1) {
                        akb.o(ss4VarC, "Unknown strategy: ");
                        return f5dVar;
                    }
                    z2 = true;
                    xd3Var = new h5d(dVar.c.a, eVar.l0, eVar.X, eVar.a0, eVar.b0, prfVar, cls, eVar.d0);
                }
                t29<Z> t29Var = (t29) t29.e.acquire();
                t29Var.d = false;
                t29Var.c = z2;
                t29Var.b = f5dVarA;
                e.b<?> bVar = eVar.f;
                bVar.a = xd3Var;
                bVar.b = n5dVar;
                bVar.c = t29Var;
                obj = t29Var;
            }
            return this.c.c(obj, ovaVar);
        } catch (Throwable th) {
            ngbVar.a(list);
            throw th;
        }
    }

    public final f5d<ResourceType> b(a<DataType> aVar, int i, int i2, ova ovaVar, List<Throwable> list) throws GlideException {
        List<? extends j5d<DataType, ResourceType>> list2 = this.b;
        int size = list2.size();
        f5d<ResourceType> f5dVarB = null;
        for (int i3 = 0; i3 < size; i3++) {
            j5d<DataType, ResourceType> j5dVar = list2.get(i3);
            try {
                if (j5dVar.a(aVar.a(), ovaVar)) {
                    f5dVarB = j5dVar.b(aVar.a(), i, i2, ovaVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + j5dVar, e);
                }
                list.add(e);
            }
            if (f5dVarB != null) {
                break;
            }
        }
        if (f5dVarB != null) {
            return f5dVarB;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
