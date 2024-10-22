package org.example.characters;

import org.example.npc.NPC;

public interface Abilities {

   void lightAttack(NPC enemy); // level 1
   void heavyAttack(NPC enemy); // level 1, cd 1 round
   void damageOverTime(NPC enemy); // level 2
   void sustainAttack(NPC enemy); // level 3 cd 2 rounds
   void crowdControl(NPC enemy); // level 5

   boolean isCrit(int critChance);


}
