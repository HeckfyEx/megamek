/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 * 
 *  This program is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License as published by the Free 
 *  Software Foundation; either version 2 of the License, or (at your option) 
 *  any later version.
 * 
 *  This program is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 *  for more details.
 */
package megamek.common.weapons;

import megamek.common.Aero;
import megamek.common.AmmoType;
import megamek.common.IGame;
import megamek.common.ToHitData;
import megamek.common.WeaponType;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

/**
 * @author Jay Lawson
 */
public class DiveBombAttack extends Weapon {
    /**
     * 
     */
    private static final long serialVersionUID = -179884141546884171L;

    public DiveBombAttack() {
        this.name = "Dive Bomb";
        this.setInternalName(Aero.DIVE_BOMB_ATTACK);
        this.heat = 0;
        this.damage = DAMAGE_SPECIAL;
        this.ammoType = AmmoType.T_NA;
        this.minimumRange = WEAPON_NA;
        this.shortRange = 0;
        this.mediumRange = 0;
        this.longRange = 0;
        this.extremeRange = 0;
        this.tonnage = 0.0f;
        this.criticals = 0;
        this.bv = 0;
        this.cost = 0;
        this.flags |= WeaponType.F_DIVE_BOMB | WeaponType.F_SOLO_ATTACK;
        this.hittable = false;     
        this.capital = true;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see megamek.common.weapons.Weapon#getCorrectHandler(megamek.common.ToHitData,
     *      megamek.common.actions.WeaponAttackAction, megamek.common.Game)
     */
    @Override
    protected AttackHandler getCorrectHandler(ToHitData toHit,
            WeaponAttackAction waa, IGame game, Server server) {
        return new DiveBombAttackHandler(toHit, waa, game, server);
    }
}
