package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public enum sta {
    NotSelected(1, R.string.square_create_category_notselected),
    /* JADX INFO: Fake field, exist only in values array */
    School(2, R.string.square_create_category_school),
    /* JADX INFO: Fake field, exist only in values array */
    Friend(7, R.string.square_create_category_friend),
    /* JADX INFO: Fake field, exist only in values array */
    Company(5, R.string.square_create_category_company),
    /* JADX INFO: Fake field, exist only in values array */
    Organization(6, R.string.square_create_category_org),
    /* JADX INFO: Fake field, exist only in values array */
    Region(8, R.string.square_create_category_region),
    /* JADX INFO: Fake field, exist only in values array */
    Baby(28, R.string.square_create_category_baby),
    /* JADX INFO: Fake field, exist only in values array */
    Sports(16, R.string.square_create_category_sports),
    /* JADX INFO: Fake field, exist only in values array */
    Game(17, R.string.square_create_category_game),
    /* JADX INFO: Fake field, exist only in values array */
    Book(29, R.string.square_create_category_book),
    /* JADX INFO: Fake field, exist only in values array */
    Movies(30, R.string.square_create_category_movies),
    /* JADX INFO: Fake field, exist only in values array */
    Photo(37, R.string.square_create_category_photo),
    /* JADX INFO: Fake field, exist only in values array */
    Art(41, R.string.square_create_category_art),
    /* JADX INFO: Fake field, exist only in values array */
    Animation(22, R.string.square_create_category_ani),
    /* JADX INFO: Fake field, exist only in values array */
    Music(33, R.string.square_create_category_music),
    /* JADX INFO: Fake field, exist only in values array */
    Tv(24, R.string.square_create_category_tv),
    /* JADX INFO: Fake field, exist only in values array */
    Celebrity(26, R.string.square_create_category_celebrity),
    /* JADX INFO: Fake field, exist only in values array */
    Food(12, R.string.square_create_category_food),
    /* JADX INFO: Fake field, exist only in values array */
    Travel(18, R.string.square_create_category_travel),
    /* JADX INFO: Fake field, exist only in values array */
    Pet(27, R.string.square_create_category_pet),
    /* JADX INFO: Fake field, exist only in values array */
    Car(19, R.string.square_create_category_car),
    /* JADX INFO: Fake field, exist only in values array */
    Fashion(20, R.string.square_create_category_fashion),
    /* JADX INFO: Fake field, exist only in values array */
    Health(23, R.string.square_create_category_health),
    /* JADX INFO: Fake field, exist only in values array */
    Finance(40, R.string.square_create_category_finance),
    /* JADX INFO: Fake field, exist only in values array */
    Study(11, R.string.square_create_category_study),
    /* JADX INFO: Fake field, exist only in values array */
    Etc(35, R.string.square_create_category_etc);

    private final int id;
    private final int resourceId;

    sta(int i, int i2) {
        this.id = i;
        this.resourceId = i2;
    }

    public final int a() {
        return this.id;
    }

    public final int c() {
        return this.resourceId;
    }
}
