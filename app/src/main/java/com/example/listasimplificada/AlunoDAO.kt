package com.example.listasimplificada

class AlunoDAO {

    private val alunos: MutableList<Aluno> = ArrayList<Aluno>()

    fun salva(aluno: Aluno) {
        alunos.add(aluno)
    }

    fun todos(): MutableList<Aluno> {
        return alunos
    }
}