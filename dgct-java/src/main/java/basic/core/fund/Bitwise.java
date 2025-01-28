package basic.core.fund;

// Bit wise operator only for int, char, byte

/*
 * 128 64 32 16 8 4 2 1
 *   0  1  1  0 0 0 1 1 >> 99   >> cosmo
 *   0  0  1  1 1 0 0 0 >> 56   >> delta
 *   0  1  0  1 1 0 1 1 >> 91   >> cosmo
 *   0  1  1  0 0 0 1 1 >> 99   >> delta
 *   0  0  1  1 1 0 0 0 >> 56   >> cosmo
 *   0  0  0  1 1 0 0 1 >> 25
 *   0  0  0  0 0 0 0 1 >>  1
 *   0  0  0  0 0 1 0 1 >>  5
 *   0  1  1  0 0 1 1 1 >> 103
 * 
 * 
 * 2048 1024 512 256 128 64 32 16 8 4 2 1
 *                     0  1  1  0 0 0 1 1 >> 99   >> cosmo
 *       1    1    0   0  0  1  1 0 0 0 0
 */

public class Bitwise {
    public static void main(String[] args) {
        char cosmo = 'c';int delta = 56;
        // System.out.println(cosmo|5);
        // System.out.println(cosmo&25);
        // cosmo^=delta;
        // delta^=cosmo;
        // cosmo^=delta;
        // System.out.println((int)cosmo+" "+delta);
        System.out.println(cosmo<<4);
    }
}
