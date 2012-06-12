import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.wrappers.widget.WidgetChild;

public class Equipment {

	/**
	 * @author _phl0w
	 * @since 12-6-2012
	 */

	public static final int WIDGET = 387;
	public static final int WIDGET_TOOLBELT = 0;
	public static final int WIDGET_ITEMS_KEPT_ON_DEATH = 1;
	public static final int WIDGET_EQUIPMENT_STATS = 38;
	public static final int WIDGET_EQUIPMENT_HELM = 6;
	public static final int WIDGET_EQUIPMENT_CAPE = 9;
	public static final int WIDGET_EQUIPMENT_NECK = 12;
	public static final int WIDGET_EQUIPMENT_WEAPON = 15;
	public static final int WIDGET_EQUIPMENT_BODY = 18;
	public static final int WIDGET_EQUIPMENT_SHIELD = 21;
	public static final int WIDGET_EQUIPMENT_LEGS = 24;
	public static final int WIDGET_EQUIPMENT_GLOVES = 27;
	public static final int WIDGET_EQUIPMENT_BOOTS = 30;
	public static final int WIDGET_EQUIPMENT_RING = 33;
	public static final int WIDGET_EQUIPMENT_ARROWS = 36;
	public static final int WIDGET_EQUIPMENT_AURA = 45;

	/**
	 * @param slot
	 * @return The item id or -1 if nothing.
	 */
	public static int getEquipment(int slot) {
		return Widgets.get(WIDGET, slot).getChildId();
	}

	/**
	 * @return The helm item id or -1 if none.
	 */
	public static int getHelm() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_HELM).getChildId();
	}

	/**
	 * @return The cape item id or -1 if none.
	 */
	public static int getCape() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_CAPE).getChildId();
	}

	/**
	 * @return The neck item id or -1 if none.
	 */
	public static int getNeck() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_NECK).getChildId();
	}

	/**
	 * @return The weapon item id or -1 if none.
	 */
	public static int getWeapon() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_WEAPON).getChildId();
	}

	/**
	 * @return The body item id or -1 if none.
	 */
	public static int getBody() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_BODY).getChildId();
	}

	/**
	 * @return The shield item id or -1 if none.
	 */
	public static int getShield() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_SHIELD).getChildId();
	}

	/**
	 * @return The legs item id or -1 if none.
	 */
	public static int getLegs() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_LEGS).getChildId();
	}

	/**
	 * @return The gloves item id or -1 if none.
	 */
	public static int getGloves() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_GLOVES).getChildId();
	}

	/**
	 * @return The boots item id or -1 if none.
	 */
	public static int getBoots() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_BOOTS).getChildId();
	}

	/**
	 * @return The ring item id or -1 if none.
	 */
	public static int getRing() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_RING).getChildId();
	}

	/**
	 * @return The arrows item id or -1 if none.
	 */
	public static int getArrows() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_ARROWS).getChildId();
	}

	/**
	 * @return The arrows stack size or 0 if empty.
	 */
	public static int getArrowStackSize() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_ARROWS).getChildStackSize();
	}

	/**
	 * @return The aura item id or -1 if none.
	 */
	public static int getAura() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_AURA).getChildId();
	}

	/**
	 * @return The toolbelt widget child.
	 */
	public static WidgetChild getToolbelt() {
		return Widgets.get(WIDGET, WIDGET_TOOLBELT);
	}

	/**
	 * @return The equipment widget child.
	 */
	public static WidgetChild getEquipment() {
		return Widgets.get(WIDGET, WIDGET_EQUIPMENT_STATS);
	}

	/**
	 * @return The items kept on death widget child.
	 */
	public static WidgetChild getItemsKeptOnDeath() {
		return Widgets.get(WIDGET, WIDGET_ITEMS_KEPT_ON_DEATH);
	}
}