package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoxTest {
    @Test
    void isThisSphere() {
        Box box = new Box(0, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Sphere");
    }

    @Test
    void isThisTetrahedron() {
        Box box = new Box(4, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Tetrahedron");
    }

    @Test
    void isThisCube() {
        Box box = new Box(8, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Cube");
    }

    @Test
    void getAreaTest8() {
        Box box = new Box(8, 10);
        int name = (int) box.getArea();
        assertThat(name).isEqualTo(600);
    }

    @Test
    void getAreaTest4() {
        Box box = new Box(4, 10);
        int name = (int) box.getArea();
        assertThat(name).isEqualTo(173);
    }
}