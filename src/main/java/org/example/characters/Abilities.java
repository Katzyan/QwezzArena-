package org.example.characters;

import org.example.npc.NPC;

public interface Abilities {

   void lightAttack(NPC enemy);
   void heavyAttack(NPC enemy);
   void sustainAttack(NPC enemy);
   void crowdControl(NPC enemy);
   void damageOverTime(NPC enemy);
   boolean isCrit(int critChance);


}
